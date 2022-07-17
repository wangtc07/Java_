import base64

import utils
import re
import os
import requests
from bs4 import BeautifulSoup
import urllib.request


url = 'https://www.youtube.com/watch?v=V9D5rbLyIsM'


# re_domain = utils.replace_domain(url, '')
#
# n_url = utils.re_ima_set_folder_path(re_domain)
# print(n_url)
#
# other_domain = re.compile(r"^https")
# if other_domain.match(re_domain):
#   print(url)

url = 'https://www.nogizaka46.com/files/46/diary/n46/MEMBER/moblog/202207/mobsGY7rt.jpg'

response = requests.get(url)

content = response.content
# print(content)
data = str(base64.b64encode(content), "utf-8")
print(data)

# 轉換base64後加上前綴
data = 'data:image/jpeg;base64,' + data

