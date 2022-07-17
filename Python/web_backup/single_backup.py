import base64

import utils
import re
import os
import requests
from bs4 import BeautifulSoup
import urllib.request


def get_base64(url: str):
  response = requests.get(url=url)
  content = response.content
  data = str(base64.b64encode(content), "utf-8")
  # 轉換base64後加上前綴
  data = 'data:image/jpeg;base64,' + data
  return data


def get_photo_base64(src):
  match = utils.domain_pattern.match(src)
  if match:
    data = get_base64(src)
    return data
  else:
    download_src = utils.DOMAIN + src
    return get_base64(download_src)


def download(url):
  re_domain = utils.replace_domain(url, '')

  n_url = utils.re_ima_set_folder_path(re_domain)

  html_url = utils.add_html(n_url)

  other_domain = re.compile(r"^https")
  if other_domain.match(re_domain):
    return []

  # 加 domain
  # https://www.nogizaka46.com/s/n46/diary/MEMBER/list?&page=0&ct=36753&cd=MEMBER.html
  domain_url = utils.add_domain(re_domain)
  # 檔案在第幾層資料夾
  path_level: int = utils.get_level(n_url)
  # headers = {
  #   'user-agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36',
  #   'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
  #   'Cookie': '__utmc=174951741; _ga=GA1.2.506322615.1645072246; __td_signed=true; _ts_yjad=1645072246687; WAPID=XOYHQ5FIIfOu94E1O0LNfrQl3cB8hGKJMkd; wap_last_event=showWidgetPage; wovn_uuid=kle42u84z; wovn_selected_lang=ja; S5SI=8plt3b79g2ulu8evr6id44070conk929; __utmz=174951741.1653654036.14.8.utmcsr=dlvr.it|utmccn=(not%20set)|utmcmd=twitter; _gcl_au=1.1.692994152.1653654036; 9DD31CEFD6719ABA=248fe041c8c7de9b23633326713fdc8b4698d96b; __utma=174951741.506322615.1645072246.1656607496.1656832205.43; __utmt=1; __utmb=174951741.1.10.1656832205; _gid=GA1.2.299101591.1656832205; _td=4991f6ef-bf12-4aa5-a95b-315fd89d01e8'
  # }
  # request = urllib.request.Request(url=domain_url, headers=headers)
  # response = urllib.request.urlopen(request)
  response = requests.get(url=domain_url, )
  # 設定編碼格式
  response.encoding = 'UTF-8'
  origin_html = response.text

  soup = BeautifulSoup(origin_html, 'lxml')

  # 檔名及路徑
  titles = soup.select('title')
  html_url = './' + titles[0].text + '.html'



  # 圖片
  # data-src="https://www.nogizaka46.com/images/46/445/60cae08cc551e45e9d8aa008f871c.jpg"
  # ->
  # style="background-image: url("https://www.nogizaka46.com/images/46/445/60cae08cc551e45e9d8aa008f871c.jpg");"
  data_src = soup.find_all(attrs={'data-src': True})

  # for data in data_src:
  #   # 取得 data-src 屬性
  #   src: str = data['data-src']
  #   # utils.download_path(src)
  #   # 轉 base64
  #   base64_data = get_photo_base64(src)
  #   local_path = utils.replace_domain(src, utils.EMPTY)
  #   local_path = utils.get_data_path(local_path, path_level)
  #   style = 'background-image: url(' + base64_data + ');'
  #   data['style'] = style
  #
  #   # 加上 is-l
  #   class_list: list = data['class']
  #   class_list.append('is-l')
  #   new_class = ' '.join(class_list)
  #   data['class'] = new_class



  #
  # # 取得所有 class
  # # clazz: bl--card js-pos a--op hv--thumb
  # def get_class_list(clazz):
  #   clazz_finder = '.' + re.sub(r" ", '.', clazz)
  #   list = soup.select(clazz_finder)
  #   return list
  #
  # def replace_class(clazz: str):
  #   list = get_class_list(clazz)
  #   for item in list:
  #     item['class'] = clazz + ' is-v'
  #
  # def replace_class_by_list(clazz, list):
  #   for item in list:
  #     item['class'] = clazz + ' is-v'
  #
  # # 等待下載清單: /s/n46/diary/detail/100091?ima=4435&cd=MEMBER
  # wait_download = []
  #
  # def set_new_link_and_wait_download(html_list: list):
  #   for html in html_list:
  #     # 下載新頁面
  #     link = html['href']
  #     print('下載新頁面: ', link)
  #     wait_download.append(link)
  #     new_link = re_link_path(link, path_level)
  #     html_path = add_html(new_link)
  #     re_html_path = replace_reg_text(html_path)
  #     html['href'] = re_html_path
  #
  # # 頁面 list ------------------------------------------------------------
  # # class="bl--card js-pos a--op hv--thumb"
  # # ->
  # # class="bl--card js-pos a--op hv--thumb is-v"
  # blog_class = 'bl--card js-pos a--op hv--thumb'
  # blog_list = get_class_list(blog_class)
  # replace_class_by_list(blog_class, blog_list)
  # # 移除連結 ima 參數，加入下載清單，替換連結
  # set_new_link_and_wait_download(blog_list)
  #
  # # blog 標題
  # title_class = 'bd--hd__ttl f--head a--tx js-tdi'
  # title_list = get_class_list(title_class)
  # replace_class_by_list(title_class, title_list)
  #
  # date_class = 'bd--hd__date a--tx js-tdi is-v'
  # date_list = get_class_list(date_class)
  # replace_class_by_list(date_class, date_list)
  #
  # # new entry blog
  # new_entry = soup.select('.bd--ne__one__a.hv--op')
  # set_new_link_and_wait_download(new_entry)
  # view_new = soup.select('.bd--ne__btn__a m--fic.hv--op')
  # set_new_link_and_wait_download(view_new)
  #
  # # 前の記事 bd--hn__a hv--op
  # next_blog = soup.select('.bd--hn__a.hv--op')
  # set_new_link_and_wait_download(next_blog)
  # # BLOG底部 m--pnv__a m--fic hv--op
  # footer_blog = soup.select('.m--pnv__a.m--fic.hv--op')
  # set_new_link_and_wait_download(footer_blog)
  # # 日曆 calender blog
  # # calender_blog = soup.select('td a')
  # # set_new_link_and_wait_download(calender_blog)
  # # 大頭相
  # header = soup.select('.bd--prof__img.m--fic.hv--op')
  # set_new_link_and_wait_download(header)
  # # title
  # title = soup.select('.m--allhd__ja__a.hv--op')
  # set_new_link_and_wait_download(title)
  #
  # # 替換 dcimg 到 <img>
  # a_link = soup.select('a')
  # dc_img_paths = []
  # for link in a_link:
  #   reg = re.compile('.*dcimg.*')
  #   if reg.match(str(link)):
  #     # url: http://dcimg.awalker.jp/v/TBW3s78it3wcC9OXcPugfpOCfR0aALu1V5B3ezGQ5MwA1ybuj0iORLLQ7xNpv7IA724oeWQcEPcwA53gyeLTI5hrSzE38OBgpBt6yjiosCzY4rLAYqTxCnUGgzLvElzq7SzKn9QF3mmSaAWw8j5WKVStUZWdJJkkk0kLTmrW45fI4xJaACN9YlOWMTYdlPhSebpMo6gM
  #     # 連結失效跳過
  #     if utils.is_err_dcimg(link['href']):
  #       link['href'] = ''
  #       continue
  #     url = link['href']
  #     # path = download_dc_page(url)
  #     wait_download.append(url)
  #     path = re.sub(r"http://dcimg\.awalker\.jp/v", '/i', url) + '.png'
  #     l_path = utils.get_data_path(path, path_level)
  #     dc_img_paths.append(l_path)
  #     link['href'] = l_path
  #
  # # img
  # # src="/images/46/ac5/8b0421d858a5cc0abe8d40ba31903.jpg"
  # imgs = soup.select('img')
  # i = 0
  # for img in imgs:
  #   reg = re.compile('.*src.*')
  #   if reg.match(str(img)):
  #     img_url = img['src']
  #     wait_download.append(img_url)
  #     new_link = utils.get_data_path(img_url, path_level)
  #     # l_path = dc_img_paths[i]
  #     img['src'] = new_link
  #     i = i + 1
  #
  # # 顯示
  # # blog 標題
  # # class="m--allhd js-pos js-tdg is-v"
  # # footer
  # # class="b--ft__nv js-pos js-tdg is-v"
  # # class="b--ft__sns js-pos js-tdg is-v"
  # # class="b--ft__sub js-pos js-tdg is-v"
  # replace_class('m--allhd js-pos js-tdg')
  # replace_class('b--ft__nv js-pos js-tdg')
  # replace_class('b--ft__sns js-pos js-tdg')
  # replace_class('b--ft__sub js-pos js-tdg')
  # # 大頭 right
  # # class="bd--prof js-pos a--op is-v"
  # replace_class('bd--prof js-pos a--op')
  # # 日曆
  # # class="bd--arc js-pos a--op js-arccl is-v"
  # replace_class('bd--arc js-pos a--op js-arccl')
  # # 分頁 ------------------------------------------------------------
  # # class="bl--pg js-pos a--op is-v"
  # replace_class('bl--pg js-pos a--op')
  #
  # # 頁碼
  # page_list = soup.select('.coun a')
  # set_new_link_and_wait_download(page_list)
  #
  # # 下一頁
  # next_page = soup.select('.next a')
  # set_new_link_and_wait_download(next_page)
  #
  # # 前一頁
  # prv_page = soup.select('.prev a')
  # set_new_link_and_wait_download(prv_page)
  #
  # # 最前、後
  # pager_page = soup.select('._pager a')
  # set_new_link_and_wait_download(pager_page)
  #
  # # js
  # #     <script src="/files/46/assets/js/lib.js" defer></script>
  # #     <script src="/files/46/assets/js/vndr2.js" defer></script>
  # #     <script src="/files/46/assets/js/app2.js" defer></script>
  js = soup.find_all('script', src=True)

  def download_replace_same(path: str, attr: str, label):
    # download_path(path)
    # wait_download.append(path)
    attr_path = utils.get_data_path(path, path_level)
    label[attr] = attr_path

  for j in js:
    # 取得網址
    path = j['src']
    reg = re.compile(r'.*vndr.*')
    if reg.match(path):
      print(path)
      vndr = open('./help/vndr2.js', encoding='UTF-8')
      j.string = vndr.read()
    # download_replace_same(path, 'src', j)
  # # css
  # # <link rel="preload" href="/files/46/assets/fonts/icons.woff2" as="font" type="font/woff2" crossorigin>
  # # <link rel="preload" as="style" href="/files/46/assets/css/style2.css" onload="this.onload = null; this.rel='stylesheet';">
  link_list = soup.find_all('link',
                            attrs={
                              "rel": ["preload", "apple-touch-icon", "icon",
                                      "manifest", "mask-icon"]})
  for link in link_list:
    path = link['href']
    reg = re.compile(r'.*style2.*')
    if reg.match(path):
      print(path)
      css = open('./help/style2.css', encoding='UTF-8')
      link.string = css.read()
    # download_replace_same(path, 'href', link)
  #
  # # 儲存 html
  print(html_url)
  utils.download_html(html_url, soup.prettify())
  #
  # return wait_download


if __name__ == '__main__':
  url: str = 'https://www.nogizaka46.com/s/n46/diary/detail/100415?ima=2618'

  download(url)
