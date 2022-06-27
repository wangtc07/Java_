import requests
from bs4 import BeautifulSoup
import re
import utils

ROOT_PATH = '.'
EMPTY = ''

url = '/s/n46/diary/MEMBER/list?ima=1735&page=0&ct=36753&cd=MEMBER'


# 下載一個頁面
def download_html(url):
  # 移除 ima
  n_url = utils.re_link_path(url, 0)

  # 檢查是否下載過
  # ./s/n46/diary/MEMBER/list?&page=0&ct=36753&cd=MEMBER.html
  html_url = utils.add_html(n_url)
  flag = utils.check_downloaded(html_url)
  print(n_url)
  if not flag:
    return

  domain_url = utils.add_domain(n_url)
  path_level: int = utils.get_level(n_url)
  response = requests.get(url=domain_url)
  # 設定編碼格式
  response.encoding = 'UTF-8'
  origin_html = response.text
  print('+++++++++++++++++++++++++++++++++++++++++++++++++')
  soup = BeautifulSoup(origin_html, 'lxml')
  # print(soup)
  # print('+++++++++++++++++++++++++++++++++++++++++++++++++')
  # 圖片
  # data-src="https://www.nogizaka46.com/images/46/445/60cae08cc551e45e9d8aa008f871c.jpg"
  # ->
  # style="background-image: url("https://www.nogizaka46.com/images/46/445/60cae08cc551e45e9d8aa008f871c.jpg");"
  data_src = soup.find_all(attrs={'data-src': True})
  print(data_src)
  domain_pattern = re.compile(r'https://www\.nogizaka46\.com/.*')
  for data in data_src:
    # 取得 data-src 屬性
    src = data['data-src']
    utils.download_path(src)
    local_path = utils.replace_domain(src, EMPTY)
    local_path = utils.get_data_path(local_path, path_level)
    style = 'background-image: url(' + local_path + ');'
    data['style'] = style

    # 加上 is-l
    print(data['class'])
    class_list: list = data['class']
    class_list.append('is-l')
    new_class = ' '.join(class_list)
    data['class'] = new_class
    # style = 'background-image: url("' + src + '";)'
    # data['style'] = style
  print('+++++++++++++++++++++++++++++++++++++++++++++++++')

  # 取得所有 class
  # clazz: bl--card js-pos a--op hv--thumb
  def get_class_list(clazz):
    clazz_finder = '.' + re.sub(r" ", '.', clazz)
    list = soup.select(clazz_finder)
    return list

  def replace_class(clazz: str):
    list = get_class_list(clazz)
    for item in list:
      item['class'] = clazz + ' is-v'

  def replace_class_by_list(clazz, list):
    for item in list:
      item['class'] = clazz + ' is-v'

  # 頁面 list ------------------------------------------------------------
  # class="bl--card js-pos a--op hv--thumb"
  # ->
  # class="bl--card js-pos a--op hv--thumb is-v"
  blog_class = 'bl--card js-pos a--op hv--thumb'
  blog_list = get_class_list(blog_class)
  replace_class_by_list(blog_class, blog_list)

  # 等待下載清單: /s/n46/diary/detail/100091?ima=4435&cd=MEMBER
  wait_download = []

  def set_new_link_and_wait_download(html_list: list):
    for html in html_list:
      # 下載新頁面
      print(html)
      link = html['href']
      wait_download.append(link)
      new_link = utils.re_link_path(link, path_level)
      html['href'] = new_link

  # 移除連結 ima 參數，加入下載清單，替換連結
  set_new_link_and_wait_download(blog_list)

  # 顯示
  # blog 標題
  # class="m--allhd js-pos js-tdg is-v"
  # footer
  # class="b--ft__nv js-pos js-tdg is-v"
  # class="b--ft__sns js-pos js-tdg is-v"
  # class="b--ft__sub js-pos js-tdg is-v"
  replace_class('m--allhd js-pos js-tdg')
  replace_class('b--ft__nv js-pos js-tdg')
  replace_class('b--ft__sns js-pos js-tdg')
  replace_class('b--ft__sub js-pos js-tdg')
  # 大頭 right
  # class="bd--prof js-pos a--op is-v"
  replace_class('bd--prof js-pos a--op')
  # 日曆
  # class="bd--arc js-pos a--op js-arccl is-v"
  replace_class('bd--arc js-pos a--op js-arccl')
  # 分頁 ------------------------------------------------------------
  # class="bl--pg js-pos a--op is-v"
  replace_class('bl--pg js-pos a--op')

  # 頁碼
  page_list = soup.select('.coun a')
  set_new_link_and_wait_download(page_list)

  # 下一頁
  next_page = soup.select('.next a')
  set_new_link_and_wait_download(next_page)

  # 前一頁
  prv_page = soup.select('.prev a')
  set_new_link_and_wait_download(prv_page)

  # 最前、後
  pager_page = soup.select('._pager a')
  set_new_link_and_wait_download(pager_page)

  # js
  #     <script src="/files/46/assets/js/lib.js" defer></script>
  #     <script src="/files/46/assets/js/vndr2.js" defer></script>
  #     <script src="/files/46/assets/js/app2.js" defer></script>
  js = soup.find_all('script', src=True)

  def download_replace_same(path: str, attr: str, label):
    global local_path
    utils.download_path(path)
    local_path = utils.get_data_path(path, path_level)
    label[attr] = local_path

  for j in js:
    # 取得網址
    path = j['src']
    download_replace_same(path, 'src', j)
  # css
  # <link rel="preload" href="/files/46/assets/fonts/icons.woff2" as="font" type="font/woff2" crossorigin>
  # <link rel="preload" as="style" href="/files/46/assets/css/style2.css" onload="this.onload = null; this.rel='stylesheet';">
  link_list = soup.find_all('link',
                            attrs={
                              "rel": ["preload", "apple-touch-icon", "icon",
                                      "manifest", "mask-icon"]})
  for link in link_list:
    path = link['href']
    download_replace_same(path, 'href', link)

  # 儲存 html
  utils.download_html(html_url, soup.prettify())

  # 更新已下載的檔案
  utils.add_downloaded(html_url)
  utils.write_log()
  # 紀錄帶下載的 log
  utils.write_wait_download_log(wait_download)


download_html(url)
