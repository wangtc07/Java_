import os
import re
import sys
import time

import requests

sys.path.append("..")
from web_backup import utils

DOMAIN = 'https://www.nogizaka46.com/'
domain_pattern = re.compile(r'https://www\.nogizaka46\.com/.*')


def get_class_list(clazz, soup):
    clazz_finder = '.' + re.sub(r" ", '.', clazz)
    print('class: ', clazz_finder)
    list: list = soup.select(clazz_finder)
    print('list size: ', len(list))
    return list


def add_domain(url):
    path = re.sub(r"^/", '', url)
    return DOMAIN + path


def make_dirs(path):
    if not os.path.isdir(path):
        os.makedirs(path)


def modify_file_time(file_path, time_str):
    datetime_obj = time.mktime(time.strptime(time_str, "%Y.%m.%d %H:%M"))
    file_info = os.stat(file_path)
    os.utime(file_path, (file_info.st_mtime, datetime_obj))
    os.utime(file_path, (file_info.st_ctime, datetime_obj))


# date: 2022.11.05 20:58
def download_blog_imgs(src_list: list, dcimg_list: list, path: str, name: str, date: str):
    make_dirs(path)
    formate = get_file_name(date, name)

    # check exists file
    files = [f for f in os.listdir(path) if re.match(formate, f)]

    i = len(files) + 1

    for src in src_list:
        # add domain
        url = add_domain(src)

        file_path = get_path(formate, i, path)

        # download
        response = requests.get(url=url)
        # response.status_code = 404
        open(file_path, 'wb').write(response.content)

        # modify file date
        modify_file_time(file_path, date)

        i = i + 1

    for dcimg in dcimg_list:
        file_path = get_path(formate, i, path)
        print('download dcimg: ', dcimg)

        try:
            utils.download_dcimg(file_path, dcimg)

            # modify file date
            modify_file_time(file_path, date)

            i = i + 1
        except:
            print('過期: ', dcimg)

    return None


def get_path(formate, i, path):
    file_path = path + '/' + formate + '-' + str(i) + '.jpg'
    return file_path


def get_file_name(date, name):
    # get file path: "秋元真夏 blog 221105-1"
    name_formate = re.sub(r" ", '', name)
    print('name_formate: ', name_formate)
    date_formate = date[2: 10]  # 22.11.05
    date_formate = re.sub(r"\.", '', date_formate)  # 221105
    print('date_formate: ', date_formate)
    formate = name_formate + ' blog ' + date_formate
    return formate


def filter_err_dcimg(url: str):
    reg = re.compile('.*dcimg.*')
    if not reg.match(str(url)):
        return False

    err_reg = re.compile(r".*img1\.php.*")

    try:
        match = err_reg.match(url)
    except:
        print('判斷錯誤', url)
        match = False
    return not match
