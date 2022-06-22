import re
import os
import requests

ROOT_PATH = '.'
EMPTY = ''
DOMAIN = 'https://www.nogizaka46.com/'
download_log = 'downloaded.log'
wait_log = 'html_wait_download.log'
domain_pattern = re.compile(r'https://www\.nogizaka46\.com/.*')

downloaded = open(download_log, encoding='UTF-8')
text_list = downloaded.read().split('\n')


# 取得所在第幾層資料夾
def get_level(url: str):
  return len(url.split('/')) - 2


# 根據 html 在第幾層，往回推
def get_data_path(path: str, level: int):
  if level == 0:
    return '.' + path

  for i in range(level):
    if i == 0:
      path = '..' + path
    else:
      path = '../' + path
  return path


def add_domain(url):
  return DOMAIN + url


# 替換 domain
def replace_domain(path, re_str):
  return re.sub(r"https://www\.nogizaka46\.com", re_str, path)


def add_root_path(url):
  return ROOT_PATH + url


def add_html(url):
  return url + '.html'


# 取得資料夾路徑
def replace_file_path(path: str):
  # 移除檔名 ./files/46/diary/n46/MEMBER/0000_11.jpeg -> ./files/46/diary/n46/MEMBER
  path = reaplce_reg_text(path)
  arr = path.split('/')
  reg = '/' + arr[len(arr) - 1]
  return re.sub(reg, '', path)


def reaplce_reg_text(path):
  return re.sub(r'\?', '', path)


# 下載 html
# path: domain + path
def download_html(path: str, data):
  print('----->', path)
  make_dirs(path)
  open(path, 'w').write(data)


# 下載檔案
# path: ./files/46/assets/css/style2.css
def download_file(path: str, url):
  # 判斷是否已下載過
  flag = check_downloaded(path)
  print(flag)
  if flag:
    return
  # 加到陣列
  add_downloaded(path)
  print('download: ', path)
  make_dirs(path)
  # 下載檔案
  response = requests.get(url=url)
  open(path, 'wb').write(response.content)


def check_downloaded(path):
  flag = False
  for text in text_list:
    reg = re.compile(text)
    if reg.match(path):
      flag = True
  return flag


def make_dirs(path):
  folder_path = replace_file_path(path)
  print(folder_path)
  # 建立路徑
  if not os.path.isdir(folder_path):
    os.makedirs(folder_path)


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


# 寫入以下載檔案
def write_log():
  new_log = '\n'.join(text_list)
  open(download_log, 'w').write(new_log)


def add_downloaded(url):
  url = reaplce_reg_text(url)
  text_list.append(url)


def write_wait_download_log(html_list: list):
  new_log = '\n'.join(html_list)
  open(wait_log, 'w').write(new_log)


# 移除連結 ima 參數
def re_link_path(path: str, level: int):
  # 單篇 blog
  detail_reg = re.compile(r'.*detail/.*')
  list_reg = re.compile(r'.*MEMBER/list.*')
  new_path = ''
  if detail_reg.match(path):
    new_path = re.sub(r"(ima=[0-9]*&)|(ct=.*)", "", path)

  if list_reg.match(path):
    new_path = re.sub(r"(ima=[0-9]*&)", "", path)

  return get_data_path(new_path, level)

# download_file('./files/46/assets/css/style2.css', 'https://www.nogizaka46.com/files/46/assets/css/style2.css')
# download_file('./files/46/diary/n46/MEMBER/0001_10.jpeg', 'https://www.nogizaka46.com/files/46/diary/n46/MEMBER/0001_10.jpeg')

# clazz_finder = '.' + re.sub(r" ", '.', 'm--allhd js-pos js-tdg')
# print(clazz_finder)

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
