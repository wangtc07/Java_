import utils
import re

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


# url = '/s/n46/diary/MEMBER/list?ima=1735&page=0&ct=36753&cd=MEMBER'
# url = utils.re_link_path(url, 0)
# print(url)
# url = utils.add_html(url)
# print(url)
# utils.download_html(url, 'test')


new_string = re.sub(r"(ima=[0-9]*&)|(ct=.*)", "",
                    '/s/n46/diary/MEMBER/list?ima=1735&page=0&ct=36753&cd=MEMBER')
new_string = re.sub(r"(ima=[0-9]*&)|(ct=.*)", "", '/s/n46/diary/detail/65326?ima=4203&cd=MEMBER')
print(new_string)
# # /s/n46/diary/detail/65326?cd=MEMBER
# path_list = new_string.split('/')
# print(path_list)
# # ['', 's', 'n46', 'diary', 'detail', '65326?cd=MEMBER']
# print(len(path_list))
# 6
# 上去 6-1 層
# /s/n46/diary/detail/65326?cd=MEMBER.html


page = '/s/n46/diary/MEMBER/list?ima=4855&page=1&ct=36753&cd=MEMBER'
new_page = re.sub(r"(ima=[0-9]*&)", "", page)
print(new_page)

print('+++++++++++++++++++++++++++++++++++++++++++++++++')


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



print('+++++++++++++++++++++++++++++++++++++++++++++++++')


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