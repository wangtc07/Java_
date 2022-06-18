import os
import re

import requests

new_string = re.sub(r"(ima=[0-9]*)|(&c.*)", "",
                    'https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=1735&page=0&ct=36753&cd=MEMBER')
print(new_string)

fileName = re.sub(r"(.*page=)|(&.*)", "",
                    'https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=1735&page=0&ct=36753&cd=MEMBER')
print(fileName)
response = requests.get(url=new_string)
response.encoding = 'UTF-8'
path = './s/n46/diary/MEMBER/list'
if not os.path.isdir(path):
  os.makedirs(path)
open( path + '/0.html', 'wb').write(response.content)

new_string = re.sub(r"(ima=[0-9]*)|(&c.*)", "",
                    'https://www.nogizaka46.com/s/n46/diary/detail/65326?ima=4203&cd=MEMBER')

print(new_string)
