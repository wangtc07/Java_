import utils
import re
from queue import Queue
import test002

i = 1
url = '/s/n46/diary/MEMBER/list?ima=3233&page=' + str(
    i) + '&ct=36753&cd=MEMBER'

# path = re.sub(r"^/", '', url)
# print(path)

# urls = utils.download(url)
#
# for u in urls:
#   print(u)


blog = 'https://www.nogizaka46.com/s/n46/diary/detail/43548?ima=4439&cd=MEMBER'

urls = utils.download(blog)
all_urls = utils.dis_urls(urls)
html_urls = all_urls.html
other = all_urls.oth

# 要下載的 html url
queue = Queue()
# 下載完的 url
downloaded_queue = Queue()
# 要下載的 other url
other_urls = Queue()
# 下載錯誤 url
error_urls = Queue()

for oth in other:
  print(oth)
  other.append(oth)
  url = oth
  print('download other: ', url)

  # dc img
  if utils.is_dc_page(url):
    print('down dc img,', url)
    path = utils.get_dc_path(url)
    try:
      utils.download_dcimg(path, url)
    except:
      error_urls.put(url)
  # 其他資源
  else:
    print('down img,', url)
    utils.download_path(url)

dy = 'https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=4058&ct=36753&dy=20220622'

# download other:  http://dcimg.awalker.jp/v/yZBG3rPVtfZPCZU2MZMIKQ42TY1Qq9rOh4OquvGWKAa4Y3aauUwNBC3xOazCgo3HRUjZQAMGIzMfH1p6adqpYX1IfwYh5unKNIPeYnrBhdzoGILc6JNwi09UAAqWMMXj7grMyBVVFTDxr4Og4U5nJoslFQJF2f5xCyciH6aGnKIBRb87AGYIPhvy7IQsnoi3v2D9Nq0L
# download other:  https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=1322&ct=36753&dy=201803
# download other:  /files/46/_pre/blog/shiori.kubo/img/2019/09/05/8898933/0001.jpeg
# download other:  https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=1322&ct=36753&dy=201801
# download other:  /files/46/_pre/blog/shiori.kubo/img/2020/06/10/7816813/0004.jpeg
# download other:  https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=1330&ct=36753&dy=20200624

# photo = '/files/46/_pre/blog/shiori.kubo/img/2020/06/10/7816813/0004.jpeg'
#
# utils.download_path(photo)

# dc = 'http://dcimg.awalker.jp/v/yZBG3rPVtfZPCZU2MZMIKQ42TY1Qq9rOh4OquvGWKAa4Y3aauUwNBC3xOazCgo3HRUjZQAMGIzMfH1p6adqpYX1IfwYh5unKNIPeYnrBhdzoGILc6JNwi09UAAqWMMXj7grMyBVVFTDxr4Og4U5nJoslFQJF2f5xCyciH6aGnKIBRb87AGYIPhvy7IQsnoi3v2D9Nq0L'
# # dc = 'http://dcimg.awalker.jp/v/KsAAOaMrEh6alIvG5zRWgfeSDeBVaCqgGT101KmuyzJO8fjVRiW4f2UT6e1xMCbGGIweQEyxCBLkmzIwO5PLupvWP7eNBTEnVhfDWXPGGWpUu6WcNp4wWWDqNXzS10jrT4d3JpJeAWC7WasTWOM985vPTmQHMWFr5e2BXndbzb2T1JJ5gLrY5XohIx6ltrvczi2SGKrK'
#
# utils.download_path(dc)
#
# err = 'http://dcimg.awalker.jp/img1.php?id=vJ9LxiEARBRhcADomlFWVblp0RmgJy7r7negtlBVjC2t9iPWe8aL78VtKOSv82e73aIN3GfnN1mDK5BlZEM70CLLi8xeT2G28x8QPGYSRh9xYvEweGr24BLSUq9BaHkrBBP1oBS1uvp4t7MLePhiy2KNAjm0GLpgPBa9DfIwolKsFK6TptlsEkYjRstUCuANPheGENmb'
# match = utils.is_err_dcimg(dc)
#
# err_reg = re.compile(r".*img1\.php.*")
# if err_reg.match(err):
#   print(err)
#
# if match:
#   print(match)
#

import requests
from bs4 import BeautifulSoup

# test = 'https://www.nogizaka46.com/s/n46/diary/detail/43548?ima=4439&cd=MEMBER'
# response = requests.get(url=test)
# response.encoding = 'UTF-8'
# origin_html = response.text
#
# soup = BeautifulSoup(origin_html, 'lxml')
#
# a_link = soup.select('a')
# dc_img_paths = []
# for link in a_link:
#   reg = re.compile('.*dcimg.*')
#   if reg.match(str(link)):
#     print(link['href'])
#     # url: http://dcimg.awalker.jp/v/TBW3s78it3wcC9OXcPugfpOCfR0aALu1V5B3ezGQ5MwA1ybuj0iORLLQ7xNpv7IA724oeWQcEPcwA53gyeLTI5hrSzE38OBgpBt6yjiosCzY4rLAYqTxCnUGgzLvElzq7SzKn9QF3mmSaAWw8j5WKVStUZWdJJkkk0kLTmrW45fI4xJaACN9YlOWMTYdlPhSebpMo6gM
#     # 連結失效跳過
#     if utils.is_err_dcimg(link['href']):
#       print('is err img ', link['href'])
#       link['href'] = ''
#       continue
#     url = link['href']
#     print('download href ', url)


# list = [dy, url]
# us = utils.dis_urls(list)
#
# for u in us.oth:
#   print(u)
#
# print('---')
#
# for u in us.html:
#   print(u)

# re_domain = utils.replace_domain(dy, '')
# print(re_domain)
#
# n_url = utils.re_ima_set_folder_path(re_domain)
# print(n_url)
#
# html_url = utils.add_html(n_url)
# print(html_url)
#
# domain_url = utils.add_domain(re_domain)
#
# print(domain_url)


# re_domain = utils.replace_domain(url, '')
# print(re_domain)
#
# n_url = utils.re_link_path(re_domain)
# print(n_url)
#
#
# png = '/files/46/assets/img/blog/none.png'
# png_path = utils.re_link_path(png)
# print(png_path)
