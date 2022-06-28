import utils
from queue import Queue

#
# url = 'https://www.nogizaka46.com/s/n46/diary/detail/56833?ima=2825&cd=MEMBER'
#
# wait_urls = utils.download(url)
#
# for wait_url in wait_urls:
#     print(wait_url)



# file:///Users/tcwang/Documents/Coding/Python/web_backup/s/n46/diary/MEMBER/list?page=3&ct=36753&cd=MEMBER.html
# file:///Users/tcwang/Documents/Coding/Python/web_backup/s/n46/diary/MEMBER/list%3Fpage=3&ct=36753&cd=MEMBER.html


q = Queue()

q.put('/s/n46/diary/MEMBER/list?ima=2614&page=9&ct=36753&cd=MEMBER')

n_url = utils.re_ima_path('/s/n46/diary/MEMBER/list?ima=0658&page=9&ct=36753&cd=MEMBER')
print(n_url)

html_url = utils.add_html(n_url)
print(html_url)