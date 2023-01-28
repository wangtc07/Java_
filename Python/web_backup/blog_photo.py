import re
from queue import Queue
from threading import Thread

import requests
from bs4 import BeautifulSoup
from util import web_utils


def get_soup(cur_url):
    # get url response
    cur_url = web_utils.add_domain(cur_url)
    response = requests.get(cur_url)
    # set encode
    response.encoding = 'UTF-8'
    # get html text
    html = response.text
    # get beautiful soup
    soup = BeautifulSoup(html, 'lxml')
    return soup


def get_blog_urls(cur_url):
    # get soup
    soup = get_soup(cur_url)

    # blog link class
    blog_class = 'bl--card js-pos a--op hv--thumb'

    # get class list
    blog_list = web_utils.get_class_list(blog_class, soup)
    link_list: list = []
    for blog in blog_list:
        # get href link
        link: str = blog['href']
        # print('blog url: ', link)
        link_list.append(link)

    return link_list


def get_src(html):
    return html['src']


def filter_jpg(src):
    gif_reg = re.compile(r".*\.gif")
    if gif_reg.match(src):
        return False

    return True


def get_href(html):
    return html['href']


def download_img(cur_url, path: str):
    print('download img: ', cur_url)
    # get soup
    soup = get_soup(cur_url)

    # get img link
    img_htmls = soup.select('img')
    src_list = map(get_src, img_htmls)
    src_list = list(filter(filter_jpg, src_list))
    print('src list: ', src_list)

    # get dcimg
    a_link = soup.select('a')
    href_list = map(get_href, a_link)
    # filter error link
    dcimg_list = filter(web_utils.filter_err_dcimg, href_list)

    # get member name
    names = web_utils.get_class_list('bd--prof__name f--head', soup)
    name = names[0].get_text()

    # get date 2022.11.05 20:58
    dates = web_utils.get_class_list('bd--hd__date a--tx js-tdi', soup)
    date = dates[0].get_text()

    # get date
    web_utils.download_blog_imgs(src_list, dcimg_list, path, name, date)

    # download img
    # modify photo create day
    pass


# wait_url: not download page
def run(wait_url: Queue, downloaded: Queue, path: str):
    while wait_url.empty() is not True:
        cur_url = wait_url.get()
        print('download url: ', cur_url)

        # if downloaded continue
        if cur_url in downloaded.queue:
            continue

        # check list page or blog page
        list_reg = re.compile('.*list.*')
        if list_reg.match(cur_url):
            print('blog list: ', cur_url)
            # list page
            # get blog page rul
            link_urls = get_blog_urls(cur_url)

            # add to wait_url
            for url in link_urls:
                wait_url.put(url)
            # map(wait_url.put, link_urls)
            print('wait: ', wait_url.empty())
        else:
            # blog page
            download_img(cur_url, path)

            # add cur rul to downloaded
            downloaded.put(cur_url)

        # done


if __name__ == '__main__':
    # folder path
    path = './temp-photo'
    # 要下載的 url
    queue = Queue()
    # 下載完的 url
    downloaded_queue = Queue()

    # blog list
    pages = 34
    base_url = '/s/n46/diary/MEMBER/list?ima=4653&page='
    member_url = '&ct=264&cd=MEMBER'
    for i in range(pages):
        queue.put(base_url + str(i) + member_url)

    threads = []
    for i in range(10):
        thread = Thread(target=run,
                        args=(queue, downloaded_queue, path))
        thread.daemon = True  # 隨主線程退出而退出
        thread.start()
        thread.join()
        # threads.append(thread)
