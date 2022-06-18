import requests
from bs4 import BeautifulSoup
import re
import utils

ROOT_PATH = '.'
EMPTY = ''

url = 'https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=1735&page=0&ct=36753&cd=MEMBER'
response = requests.get(url=url)
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
    # 取得匹配結果，無法匹配返回 None
    match = domain_pattern.match(src)
    print(match)
    if match:
        # 有 domain -> https://www.nogizaka46.com/files/46/diary/n46/MEMBER/0000_11.jpeg
        # 下載到本機路徑
        local_path = ROOT_PATH + utils.replace_domain(src, EMPTY)
        print('download', src, local_path)
        utils.download_file(local_path, src)
        style = 'background-image: url(' + local_path + ');'
        data['style'] = style
    else:
        # 沒有 domain -> /files/46/assets/img/blog/none.png
        print('not domain', src)
    # style = 'background-image: url("' + src + '";)'
    # data['style'] = style

print('+++++++++++++++++++++++++++++++++++++++++++++++++')
# print(soup.prettify())


def replace_class(clazz: str):
    clazz_finder = '.' + re.sub(r" ", '.', clazz)
    list = soup.select(clazz_finder)
    for item in list:
        item['class'] = clazz + ' is-v'

# 頁面 list
# class="bl--card js-pos a--op hv--thumb"
# ->
# class="bl--card js-pos a--op hv--thumb is-v"
replace_class('bl--card js-pos a--op hv--thumb')

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

# 分頁
# class="bl--pg js-pos a--op is-v"
replace_class('bl--pg js-pos a--op')

# js
#     <script src="/files/46/assets/js/lib.js" defer></script>
#     <script src="/files/46/assets/js/vndr2.js" defer></script>
#     <script src="/files/46/assets/js/app2.js" defer></script>

# css
# <link rel="preload" href="/files/46/assets/fonts/icons.woff2" as="font" type="font/woff2" crossorigin>
# <link rel="preload" as="style" href="/files/46/assets/css/style2.css" onload="this.onload = null; this.rel='stylesheet';">


# 儲存 html
open('test001.html', 'w').write(soup.prettify())
