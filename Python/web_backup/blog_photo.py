import re
from queue import Queue

import utils

if __name__ == '__main__':
    # 要下載的 url
    queue = Queue()
    # 下載完的 url
    downloaded_queue = Queue()

    # blog list
    pages = 10
    base_url = '/s/n46/diary/MEMBER/list?ima=4610&page='
    member_url = '&ct=284&cd=MEMBER'
    for i in range(pages):
        queue.put(base_url + str(i) + member_url)




###
# wait_url: not download page
def get_blog_urls(cur_url):
    pass


def download_img(cur_url):
    # get img link
    # get date
    # download img
    # modify photo create day
    pass


def run(wait_url: Queue, downloaded: Queue):

    while wait_url.empty() is not True:
        cur_url = wait_url.get()

        # if downloaded continue
        if cur_url in downloaded:
            continue

        # check list page or blog page
        list_reg = re.compile('.*list.*')
        if list_reg.match(cur_url):
            # list page
            # get blog page rul
            blog_urls = get_blog_urls(cur_url)

            # add to wait_url
            map(downloaded.put, blog_urls)
        else:
            # blog page
            download_img(cur_url)

        # add cur rul to downloaded
        downloaded.put(cur_url)

        # done

