import time

import requests
import re
from bs4 import BeautifulSoup
import ChormeUtils

domain_url = 'https://www.nogizaka46.com/'
url = 'https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=1735&page=0&ct=36753&cd=MEMBER'

response = requests.get(url=url)
# 設定編碼格式
response.encoding = 'UTF-8'
# open('blog.html', 'wb').write(response.content)

# selenium 模擬瀏覽器，拉到最後
browser = ChormeUtils.share_browser()
browser.get(url)
# 滑到底部
js_bottom = 'document.documentElement.scrollTop=100000'
browser.execute_script(js_bottom)
time.sleep(2)
content = browser.page_source
open('browser_blog.html', 'w').write(content)

path = response.url
print(path)
# https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=1209&ct=36753
# 去除 ima=*1209
new_string = re.sub(r"(ima=[0-9]*&)|(ct=.*)", "", 'https://www.nogizaka46.com/s/n46/diary/detail/65326?ima=4203&cd=MEMBER')
print(new_string)


soup = BeautifulSoup(response.text, 'lxml')
# 取得blog個別清單
# list = soup.findAll('a', class_='hv--thumb')
list = soup.find('a', class_='hv--thumb')
# print(list)
link = list.get('href')
# 連結網址
# /s/n46/diary/detail/100091?ima=2608&cd=MEMBER
# -> 本地位址 /s/n46/diary/detail/100091.html
print(link)

