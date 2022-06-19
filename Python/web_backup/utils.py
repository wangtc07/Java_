import re
import os
import requests

ROOT_PATH = '.'
EMPTY = ''
DOMAIN = 'https://www.nogizaka46.com/'
domain_pattern = re.compile(r'https://www\.nogizaka46\.com/.*')

# 替換 domain
def replace_domain(path, re_str):
  return re.sub(r"https://www\.nogizaka46\.com", re_str, path)


# 取得資料夾路徑
def replace_file_path(path: str):
  # 移除檔名 ./files/46/diary/n46/MEMBER/0000_11.jpeg -> ./files/46/diary/n46/MEMBER
  arr = path.split('/')
  reg = '/' + arr[len(arr) - 1]
  return re.sub(reg, '', path)


# 下載檔案
def download_file(path: str, url):
  folder_path = replace_file_path(path)
  # 建立路徑
  if not os.path.isdir(folder_path):
    os.makedirs(folder_path)
  # 下載檔案
  response = requests.get(url=url)
  open(path, 'wb').write(response.content)

def download_path(src: str):
  # 取得匹配結果，無法匹配返回 None
  match = domain_pattern.match(src)
  print(match)
  if match:
    # 有 domain -> https://www.nogizaka46.com/files/46/diary/n46/MEMBER/0000_11.jpeg
    # 下載到本機路徑
    local_path = ROOT_PATH + replace_domain(src, EMPTY)
    print('download', src, local_path)
    download_file(local_path, src)
  else:
    # 沒有 domain -> /files/46/assets/img/blog/none.png
    local_path = ROOT_PATH + src
    download_src = DOMAIN + src
    print(local_path)
    download_file(local_path, download_src)
    print('not domain', src)


clazz_finder = '.' + re.sub(r" ", '.', 'm--allhd js-pos js-tdg')
print(clazz_finder)

# download_file('./files/46/diary/n46/MEMBER/0000_11.jpeg', 'https://www.nogizaka46.com/files/46/diary/n46/MEMBER/0000_11.jpeg')

# url = './files/46/diary/n46/MEMBER/0000_11.jpeg'
# arr = url.split('/')
# last = arr[len(arr) - 1]
# print(last)
# reg = '/' + last
# print(reg)
# new = re.sub(reg, '', url)
# print(new)


# path = replace_domain(
#     'https://www.nogizaka46.com/files/46/diary/n46/MEMBER/0000_11.jpeg', '')
# print(path)
