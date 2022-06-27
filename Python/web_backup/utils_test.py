import utils
import re
import requests
import urllib.request

# utils.download_file('./files/46/assets/css/style2.css', 'https://www.nogizaka46.com/files/46/assets/css/style2.css')
# utils.download_file('./files/46/diary/n46/MEMBER/0001_10.jpeg', 'https://www.nogizaka46.com/files/46/diary/n46/MEMBER/0001_10.jpeg')
#
# utils.write_log()
# path = './s/n46/diary/MEMBER/list?page=0&ct=36753&cd=MEMBER.html'
# path = './files/46/diary/n46/MEMBER/0001_10.jpeg'
# p = utils.replace_file_path(path)
# print('+++++++++++++++++++++++++++++++++++++++++++++++++')
# print(p)
#
#
# print('+++++++++++++++++++++++++++++++++++++++++++++++++')
# reg = '/list\?page=0&ct=36753&cd=MEMBER.html'
# folder = re.sub(reg, '', path)
# print(folder)


# 移除 ima
pag = 'https://www.nogizaka46.com/s/n46/diary/MEMBER/list?page=0&ct=36753'
# wait_html_urls = utils.download(pag)
# for url in wait_html_urls:
#     print(url)
# /s/n46/diary/detail/100379?ima=1708&cd=MEMBER
# /s/n46/diary/detail/100091?ima=1708&cd=MEMBER
# /s/n46/diary/detail/65326?ima=1708&cd=MEMBER
# /s/n46/diary/detail/64574?ima=1708&cd=MEMBER
# /s/n46/diary/detail/64063?ima=1708&cd=MEMBER
# /s/n46/diary/detail/63816?ima=1708&cd=MEMBER
# /s/n46/diary/detail/63006?ima=1708&cd=MEMBER
# /s/n46/diary/detail/62993?ima=1708&cd=MEMBER
# /s/n46/diary/detail/62559?ima=1708&cd=MEMBER
# /s/n46/diary/detail/62462?ima=1708&cd=MEMBER
# /s/n46/diary/MEMBER/list?ima=1708&page=1&ct=36753&cd=MEMBER
# /s/n46/diary/MEMBER/list?ima=1708&page=2&ct=36753&cd=MEMBER
# /s/n46/diary/MEMBER/list?ima=1708&page=3&ct=36753&cd=MEMBER
# /s/n46/diary/MEMBER/list?ima=1708&page=4&ct=36753&cd=MEMBER
# /s/n46/diary/MEMBER/list?ima=1708&page=5&ct=36753&cd=MEMBER
# /s/n46/diary/MEMBER/list?ima=1708&page=1&ct=36753&cd=MEMBER
# /s/n46/diary/MEMBER/list?ima=1708&page=9&ct=36753&cd=MEMBER
# //j.wovn.io/1
# /files/46/assets/js/lib.js
# /files/46/assets/js/vndr2.js
# /files/46/assets/js/app2.js
# /files/46/assets/config/apple-touch-icon.png
# /files/46/assets/config/favicon-32x32.png
# /files/46/assets/config/favicon-16x16.png
# /files/46/assets/config/manifest.json
# /files/46/assets/config/safari-pinned.svg
# /files/46/assets/fonts/icons.woff2
# /files/46/assets/css/style2.css

# img = 'http://dcimg.awalker.jp/i/KsAAOaMrEh6alIvG5zRWgfeSDeBVaCqgGT101KmuyzJO8fjVRiW4f2UT6e1xMCbGGIweQEyxCBLkmzIwO5PLupvWP7eNBTEnVhfDWXPGGWpUu6WcNp4wWWDqNXzS10jrT4d3JpJeAWC7WasTWOM985vPTmQHMWFr5e2BXndbzb2T1JJ5gLrY5XohIx6ltrvczi2SGKrK'
#
# headers = {
#   'user-agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36',
#   'Host': 'dcimg.awalker.jp',
#   'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
#   'Cookie': 'PHPSESSID=t7595i2frp13as6shjqi032ft2; __utma=138832931.217461619.1656227363.1656227363.1656227363.1; __utmc=138832931; __utmz=138832931.1656227363.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmb=138832931.3.10.1656227363'
# }
# request = urllib.request.Request(url=img, headers=headers)
# response = urllib.request.urlopen(request)
#
# # print(response.read())
#
# p = response.read()
# open(
#     './KsAAOaMrEh6alIvG5zRWgfeSDeBVaCqgGT101KmuyzJO8fjVRiW4f2UT6e1xMCbGGIweQEyxCBLkmzIwO5PLupvWP7eNBTEnVhfDWXPGGWpUu6WcNp4wWWDqNXzS10jrT4d3JpJeAWC7WasTWOM985vPTmQHMWFr5e2BXndbzb2T1JJ5gLrY5XohIx6ltrvczi2SGKrK.png',
#     'wb').write(p)
#
# print(p)
# print(type(p))

# response = requests.get(url=img)
# print(response.content)
# open(
#   'KsAAOaMrEh6alIvG5zRWgfeSDeBVaCqgGT101KmuyzJO8fjVRiW4f2UT6e1xMCbGGIweQEyxCBLkmzIwO5PLupvWP7eNBTEnVhfDWXPGGWpUu6WcNp4wWWDqNXzS10jrT4d3JpJeAWC7WasTWOM985vPTmQHMWFr5e2BXndbzb2T1JJ5gLrY5XohIx6ltrvczi2SGKrK.png',
#   'wb').write(response.content)

dcimg = 'http://dcimg.awalker.jp/v/TBW3s78it3wcC9OXcPugfpOCfR0aALu1V5B3ezGQ5MwA1ybuj0iORLLQ7xNpv7IA724oeWQcEPcwA53gyeLTI5hrSzE38OBgpBt6yjiosCzY4rLAYqTxCnUGgzLvElzq7SzKn9QF3mmSaAWw8j5WKVStUZWdJJkkk0kLTmrW45fI4xJaACN9YlOWMTYdlPhSebpMo6gM'
dcimg_i = 'http://dcimg.awalker.jp/i/TBW3s78it3wcC9OXcPugfpOCfR0aALu1V5B3ezGQ5MwA1ybuj0iORLLQ7xNpv7IA724oeWQcEPcwA53gyeLTI5hrSzE38OBgpBt6yjiosCzY4rLAYqTxCnUGgzLvElzq7SzKn9QF3mmSaAWw8j5WKVStUZWdJJkkk0kLTmrW45fI4xJaACN9YlOWMTYdlPhSebpMo6gM'

path = './i/TBW3s78it3wcC9OXcPugfpOCfR0aALu1V5B3ezGQ5MwA1ybuj0iORLLQ7xNpv7IA724oeWQcEPcwA53gyeLTI5hrSzE38OBgpBt6yjiosCzY4rLAYqTxCnUGgzLvElzq7SzKn9QF3mmSaAWw8j5WKVStUZWdJJkkk0kLTmrW45fI4xJaACN9YlOWMTYdlPhSebpMo6gM.png'

import ChormeUtils
from selenium.webdriver.common.by import By

browser = ChormeUtils.share_browser()
browser.get(dcimg)
browser.implicitly_wait(3)
browser.save_screenshot('test.png')
img = browser.find_element(By.XPATH, '//img')
# print(img)
# 00415a8f4aada324450007caa41611ec
cook = browser.get_cookie('PHPSESSID')
print(cook)
cookies = cook['value']
print(cookies)
headers = {
  'user-agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36',
  'Host': 'dcimg.awalker.jp',
  'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
  # 'Cookie': 'PHPSESSID=t7595i2frp13as6shjqi032ft2; __utma=138832931.217461619.1656227363.1656227363.1656227363.1; __utmc=138832931; __utmz=138832931.1656227363.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmb=138832931.3.10.1656227363'
  'Cookie': 'PHPSESSID=' + 'vgu3d03rhurn632bolosvn95m9' + '; __utmc=138832931; __utmz=138832931.1656227363.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utma=138832931.217461619.1656227363.1656232261.1656255927.3; __utmt=1; __utmb=138832931.2.10.1656255927'
}

# import os
# urllib.request.urlretrieve(dcimg, os.path.join('./i' , '6hFRpVkeeZQGol0FirjaMGGxhCstxFOp0wdkCcM0vl5xX7wSp3RlyZjeBvhHPRUh6SG5bdMFTrEADDS0v16Y4LmrSOFlxnFviPuOXV5KKGOzqC0g282YZlCdo6SDC1llWPTQhM1m2sYyGiqnORA8m2HcT1Sx4vVfYpUKb1Cy2DxMONs1EZ1vP2ahj6JJ3heSyK2WbyEo.png'))


# 取得 local 瀏覽器現有 cookies
# import browser_cookie3
# import requests
#
# cj = browser_cookie3.chrome(
#   domain_name='dcimg.awalker.jp')  # firefox可以替换为browser_cookie3.firefox()
# # print(cj)
# for cook in cj:
#   print(cook.value)
# session = requests.session()
# r = requests.get(dcimg, cookies=cj)
# # browser_cookie3.chrome(domain_name='www.bitbucket.com')
# print(r)

# cook = 'PHPSESSID=t7595i2frp13as6shjqi032ft2; __utmc=138832931; __utmz=138832931.1656227363.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utma=138832931.217461619.1656227363.1656232261.1656255927.3; __utmt=1; __utmb=138832931.2.10.1656255927'
# response = requests.get(dcimg)
# print(response.status_code)
# print(response.cookies.get_dict())

# PHPSESSID=9dv062seruhnc81cpic9u22844; __utma=138832931.2126015119.1656257637.1656257637.1656257637.1; __utmc=138832931; __utmz=138832931.1656257637.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt=1; __utmb=138832931.2.10.1656257637
# PHPSESSID=t7595i2frp13as6shjqi032ft2; __utmc=138832931; __utmz=138832931.1656227363.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utma=138832931.217461619.1656227363.1656232261.1656255927.3; __utmt=1; __utmb=138832931.2.10.1656255927
# PHPSESSID=t7595i2frp13as6shjqi032ft2; __utmc=138832931; __utmz=138832931.1656227363.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utma=138832931.217461619.1656227363.1656227363.1656232261.2
# Cookie: PHPSESSID=t7595i2frp13as6shjqi032ft2
# cookies = '9dv062seruhnc81cpic9u22844'


headers = {
  'user-agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36',
  'Host': 'dcimg.awalker.jp',
  'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9',
  # 'Cookie': 'PHPSESSID=t7595i2frp13as6shjqi032ft2; __utma=138832931.217461619.1656227363.1656227363.1656227363.1; __utmc=138832931; __utmz=138832931.1656227363.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmb=138832931.3.10.1656227363'
  'Cookie': 'PHPSESSID=' + cookies + '; __utmc=138832931; __utmz=138832931.1656227363.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utma=138832931.217461619.1656227363.1656232261.1656255927.3; __utmt=1; __utmb=138832931.2.10.1656255927'
  # 'Cookie': 'PHPSESSID=8cnigu8d68e32shbi1j3s3ihqc; __utma=138832931.1738054023.1656343958.1656343958.1656343958.1; __utmc=138832931; __utmz=138832931.1656343958.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt=1; __utmb=138832931.1.10.1656343958; __gads=ID=e15372df9b1380da-220a7689cad40079:T=1656343958:RT=1656343958:S=ALNI_MakYyypVhX3Y5rP112cZLQKxbPVEA; __gpi=UID=000007090444e766:T=1656343958:RT=1656343958:S=ALNI_MZFQhDxabg9bJOOIC8jb8e7mTdTmg'
  # 'Cookie': 'PHPSESSID=8cnigu8d68e32shbi1j3s3ihqc; __utma=138832931.1738054023.1656343958.1656343958.1656343958.1; __utmc=138832931; __utmz=138832931.1656343958.1.1.utmcsr=(direct)|utmccn=(direct)|utmcmd=(none); __utmt=1; __gads=ID=e15372df9b1380da-220a7689cad40079:T=1656343958:RT=1656343958:S=ALNI_MakYyypVhX3Y5rP112cZLQKxbPVEA; __gpi=UID=000007090444e766:T=1656343958:RT=1656343958:S=ALNI_MZFQhDxabg9bJOOIC8jb8e7mTdTmg; __utmb=138832931.2.10.1656343958'
}

#
# try:
request = urllib.request.Request(url=dcimg_i, headers=headers)
response = urllib.request.urlopen(request)

p = response.read()
open(
    path,
    'wb').write(p)
# except:
#   print('error: ', dcimg)

# open(path, 'wb').write(response.content)

# utils.download_file(
#   './i/6hFRpVkeeZQGol0FirjaMGGxhCstxFOp0wdkCcM0vl5xX7wSp3RlyZjeBvhHPRUh6SG5bdMFTrEADDS0v16Y4LmrSOFlxnFviPuOXV5KKGOzqC0g282YZlCdo6SDC1llWPTQhM1m2sYyGiqnORA8m2HcT1Sx4vVfYpUKb1Cy2DxMONs1EZ1vP2ahj6JJ3heSyK2WbyEo.png',
#   dcimg)
# utils.download_dcimg(dcimg)

blog = 'https://www.nogizaka46.com/s/n46/diary/detail/56285?ima=0003&cd=MEMBER'
# utils.download(blog)

# reg = re.compile('.*dcimg.*')
# if reg.match(dcimg):
#   print(dcimg)

# img = '/i/KsAAOaMrEh6alIvG5zRWgfeSDeBVaCqgGT101KmuyzJO8fjVRiW4f2UT6e1xMCbGGIweQEyxCBLkmzIwO5PLupvWP7eNBTEnVhfDWXPGGWpUu6WcNp4wWWDqNXzS10jrT4d3JpJeAWC7WasTWOM985vPTmQHMWFr5e2BXndbzb2T1JJ5gLrY5XohIx6ltrvczi2SGKrK'
#
# level = utils.get_level(img)
# print(level)
# n_path = utils.get_data_path(img, level)
# print(n_path)
#
# print('+++++++++++++++++++++++++++++++++++++++++++++++++')

# urls = []
# urls.append('/s/n46/diary/detail/100379?ima=1708&cd=MEMBER')
# urls.append('/s/n46/diary/MEMBER/list?ima=1708&page=1&ct=36753&cd=MEMBER')
# urls.append('/files/46/assets/js/lib.js')
# urls.append('/files/46/assets/css/style2.css')
# urls.append('/files/46/diary/n46/MEMBER/0000_11.jpeg')
#
# a_urls = utils.dis_urls(urls)
#
# html = a_urls.html
# for h in html:
#   print(h)
# print('+++++++++++++++++++++++++++++++++++++++++++++++++')
#
# oth = a_urls.oth
# for o in oth:
#   print(o)
# print('+++++++++++++++++++++++++++++++++++++++++++++++++')
#
# reg = re.compile('.*MEMBER')
# print(reg.match('/files/46/diary/n46/MEMBER/0000_11.jpeg'))
#
# urls = [
#   '/files/46/diary/n46/MEMBER/0000_11.jpeg',
#   '/s/n46/diary/MEMBER/list?ima=4654&page=9&ct=36753&cd=MEMBER'
# ]
#
# a_urls = utils.dis_urls(urls)
#
# html = a_urls.html
# for h in html:
#   print(h)
# print('+++++++++++++++++++++++++++++++++++++++++++++++++')
#
# oth = a_urls.oth
# for o in oth:
#   print(o)
# print('+++++++++++++++++++++++++++++++++++++++++++++++++')

# re_domain = utils.replace_domain(
#   '/s/n46/diary/MEMBER/list?ima=3233&page=0&ct=36753&cd=MEMBER', '')
# n_url = utils.re_link_path(re_domain, 0)
# print(n_url)
# # download path:  ../s/n46/diary/MEMBER/list?page=0&ct=36753&cd=MEMBER.html
# domain_url = utils.add_domain(n_url)
# print(domain_url)
#
# utils.download_path('/images/46/ac5/8b0421d858a5cc0abe8d40ba31903.jpg')

# page = '/s/n46/diary/MEMBER/list?page=0&ct=36753'
# blog = '/s/n46/diary/detail/100379?ima=3233&cd=MEMBER'
#
# re_page = utils.re_link_path(page, 0)
# print(re_page)
#
# re_blog = utils.re_link_path(blog, 0)
# print(re_blog)

# url = '/s/n46/diary/MEMBER/list?ima=1735&page=0&ct=36753&cd=MEMBER'
# url = utils.re_link_path(url, 0)
# print(url)
# url = utils.add_html(url)
# print(url)
# utils.download_html(url, 'test')


# new_string = re.sub(r"(ima=[0-9]*&)|(ct=.*)", "",
#                     '/s/n46/diary/MEMBER/list?ima=1735&page=0&ct=36753&cd=MEMBER')
# new_string = re.sub(r"(ima=[0-9]*&)|(ct=.*)", "", '/s/n46/diary/detail/65326?ima=4203&cd=MEMBER')
# print(new_string)
# # /s/n46/diary/detail/65326?cd=MEMBER
# path_list = new_string.split('/')
# print(path_list)
# # ['', 's', 'n46', 'diary', 'detail', '65326?cd=MEMBER']
# print(len(path_list))
# 6
# 上去 6-1 層
# /s/n46/diary/detail/65326?cd=MEMBER.html


# page = '/s/n46/diary/MEMBER/list?ima=4855&page=1&ct=36753&cd=MEMBER'
# new_page = re.sub(r"(ima=[0-9]*&)", "", page)
# print(new_page)


from bs4 import BeautifulSoup

# soup = BeautifulSoup(open('blog.html', encoding='UTF-8'), 'lxml')

# page_list = soup.select('.coun a')
# print(page_list)
# print(len(page_list))
#
# next_page = soup.select('.next a')
# print(next_page)
#
# prv_page = soup.select('.prev a')
# print(prv_page)
#
# pager_page = soup.select('._pager a')
# print(pager_page)


# def get_class_list(clazz):
#   clazz_finder = '.' + re.sub(r" ", '.', clazz)
#   list = soup.select(clazz_finder)
#   return list
#
# page_class = 'bl--card js-pos a--op hv--thumb'
# page_list = get_class_list(page_class)


# 等待下載清單
wait_download = []

# for page in page_list:
#   # 下載新頁面
#   link = page['href']
#   print(link)
#   wait_download.append(link)
#
# print(wait_download)
