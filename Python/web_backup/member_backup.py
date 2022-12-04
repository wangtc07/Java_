import re
import time
import requests
import threading
from lxml import etree
from bs4 import BeautifulSoup
from queue import Queue
from threading import Thread
import utils

### 下載 html
# index 第幾線程
# wait_html_urls 要下載的 url
# out_downloaded_urls 已下載過的 rul
# out_other_urls 要下載的 資源 url
def run(index, wait_html_urls: Queue, out_downloaded_urls: Queue, out_other_urls: Queue):
  # print(index, '----------')
  test = 1
  while wait_html_urls.empty() is not True:
    # if test > 2:
    #   wait_html_urls = Queue()
    #   break
    test = test + 1
    url = wait_html_urls.get()
    print(index, 'download: ', url)
    # 移除 ima
    # /s/n46/diary/MEMBER/list?page=9&ct=36753&cd=MEMBER
    n_url = utils.re_ima_path(url)

    # 加 html
    # /s/n46/diary/MEMBER/list?page=9&ct=36753&cd=MEMBER.html
    # html_url = utils.add_html(n_url)

    # 移除 ? 號
    # ed_url = utils.reaplce_reg_text(html_url)
    # 檢查是否下載過
    content = n_url in out_downloaded_urls.queue
    print('檢查是否下載過: ', content, n_url)

    # 下載過 -> 跳過
    if content:
      continue

    # 下載 html, 返回未下載連結
    urls = utils.download(url)

    # 區分 .html 和 其他
    all_urls = utils.dis_urls(urls)
    html_urls = all_urls.html
    # 沒下載過加回待下載 html
    for html_url in html_urls:
      # 移除 ima
      # /s/n46/diary/MEMBER/list?page=9&ct=36753&cd=MEMBER
      n_html_url = utils.re_ima_path(html_url)
      # 加 html
      # /s/n46/diary/MEMBER/list?page=9&ct=36753&cd=MEMBER.html
      # html_url = utils.add_html(n_url)
      content = n_html_url in out_downloaded_urls.queue
      print("下載過:", content, html_url)
      if content:
        continue
      else:
        print('add html: ', n_html_url)
        wait_html_urls.put(n_html_url)

    # 其他 待下載 url
    oth_urls: list = all_urls.oth
    out_oth_urls = set(out_other_urls.queue)

    # 移除下載過的
    for other_url in oth_urls:
      out_oth_urls.add(other_url)
    for other_url in out_oth_urls:
      out_other_urls.put(other_url)

    out_downloaded_urls.put(n_url)
    print('download done: ', wait_html_urls.qsize(), n_url)
    wait_html_urls.task_done()

  # if html.empty() is not True:
  #   run(index - 1, html, out_downloaded_urls)


def download_oth(out_other_urls: Queue, error_urls: Queue, ed_urls: Queue):
  while out_other_urls.empty() is not True:
    url = out_other_urls.get()
    print('download other: ', url)

    if url in ed_urls.queue:
      out_other_urls.task_done()
      continue

    # dc img
    if utils.is_dc_page(url):
      path = utils.get_dc_path(url)
      try:
        utils.download_dcimg(path, url)
      except:
        error_urls.put(url)
    # 其他資源
    else:
      utils.download_path(url)

    out_other_urls.task_done()


download_log = 'downloaded.log'
import multiprocessing

if __name__ == '__main__':
  start = time.time()
  # 要下載的 html url
  queue = Queue()
  # 下載完的 url
  downloaded_queue = Queue()
  # 要下載的 資源 url
  other_urls = Queue()
  # 下載錯誤 url
  error_urls = Queue()

  # # 要下載的 html url
  # queue = multiprocessing.Manager().Queue()
  # # 下載完的 url
  # downloaded_queue = multiprocessing.Manager().Queue()
  # # 要下載的 other url
  # other_urls = multiprocessing.Manager().Queue()
  # # 下載錯誤 url
  # error_urls = multiprocessing.Manager().Queue()

  downloaded = open(download_log, encoding='UTF-8')
  text_list = downloaded.read().split('\n')
  for url in text_list:
    print('downloaded', url)
    downloaded_queue.put(url)

  # 測試 list
  # /s/n46/diary/MEMBER/list?ima=5606&ct=40005
  # https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=1610&ct=17381
  # https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=4305&page=1&ct=36758&cd=MEMBER
  # https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=1233&page=0&ct=277&cd=MEMBER  樋口
  # https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=4610&page=0&ct=284&cd=MEMBER  和田
  # TODO
  #   <div class="b--ld" id="js-ld">
  #   </div>
  # 會有這個標籤擋在最上方
  for i in range(50):
    queue.put(
        '/s/n46/diary/MEMBER/list?ima=4610&page=' + str(
            i) + '&ct=284&cd=MEMBER')

  # 測試 blog
  # queue.put('https://www.nogizaka46.com/s/n46/diary/detail/56454?ima=3811&cd=MEMBER')

  # print('--------------------------------------------')
  # while queue.empty() is not True:
  #   ed = queue.get()
  #   print(ed)

  # run(1, queue, downloaded_queue, other_urls)
  #
  # print('--------------------------------------------')
  # while downloaded_queue.empty() is not True:
  #   ed = downloaded_queue.get()
  #   print(ed)
  #
  # print('--------------------------------------------')
  # while other_urls.empty() is not True:
  #   oth = other_urls.get()
  #   print(oth)

  # print('queue 開始大小 %d' % queue.qsize())
  # pool = multiprocessing.Pool(5)  # 異步進程池（非阻塞）
  #
  # for index in range(10):
  #   pool.apply_async(run, args=(index, queue, downloaded_queue, other_urls,))   # 維持執行的進程總數為10，當一個進程執行完後啟動一個新進程.
  # pool.close()
  # pool.join()
  #
  # queue.join()  # 隊列消費完 線程結束

  threads = []

  for index in range(10):
    thread = Thread(target=run,
                    args=(index, queue, downloaded_queue, other_urls,))
    thread.daemon = True  # 隨主線程退出而退出
    thread.start()
    threads.append(thread)

  # 等待所有線程完成
  for thread in threads:
    thread.join()

  # queue.join()  # 隊列消費完 線程結束

  out = set(other_urls.queue)
  log = '\n'.join(out)
  open('wait_other.log', 'w').write(log)

  n_other_urls = Queue()
  for url in out:
    n_other_urls.put(url)

  print('--------------------------------------------')
  print(queue.qsize())

  print('other 開始大小 %d' % n_other_urls.qsize())

  # pool2 = multiprocessing.Pool(5)  # 異步進程池（非阻塞）
  #
  # for index in range(10):
  #   pool2.apply_async(download_oth, args=(other_urls, error_urls, downloaded_queue))   # 維持執行的進程總數為10，當一個進程執行完後啟動一個新進程.
  # pool2.close()
  # pool2.join()
  #
  # queue.join()  # 隊列消費完 線程結束

  for i in range(0, 2):
    thread2 = Thread(target=download_oth,
                     args=(n_other_urls, error_urls, downloaded_queue))
    thread2.daemon = True  # 隨主線程退出而退出
    thread2.start()

  n_other_urls.join()  # 隊列消費完 線程結束
  print('--------------------------------------------')
  print(n_other_urls.qsize())

  # 下載 other_urls
