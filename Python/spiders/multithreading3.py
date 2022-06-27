import re
import time
import requests
import threading
from lxml import etree
from bs4 import BeautifulSoup
from queue import Queue
from threading import Thread
import multiprocessing
import time


def run(index, in_q, out_q: Queue):
  print('----------')
  print('thread:', index)
  html = Queue()
  while in_q.empty() is not True:
    print('------------------------------')
    print(index, in_q.get())
    time.sleep(2)
    # 取得頁面連結
    # if index == 1:
    #   print(index)
    #   out_q.put('html' + str(index))
    #   html.put('html' + str(index))
    # elif index == 0:
    #   out_q.put('link' + str(index))
    in_q.task_done()

  # if html.empty() is not True:
  #   run(index - 1, html, out_q)


if __name__ == '__main__':
  start = time.time()
  # queue = Queue()
  # result_queue = Queue()

  queue = multiprocessing.Manager().Queue()
  result_queue = multiprocessing.Manager().Queue()

  for i in range(0, 10):
    queue.put('https://www.nogizaka46.com/s/n46/diary/MEMBER/list?page=' + str(
        i) + '&ct=36753')
  print('queue 開始大小 %d' % queue.qsize())

  for index in range(10):
    thread = Thread(target=run, args=(index, queue, result_queue,))
    thread.daemon = True  # 隨主線程退出而退出
    thread.start()

  queue.join()  # 隊列消費完 線程結束

  # pool = multiprocessing.Pool(10)  # 異步進程池（非阻塞）
  # for index in range(1000):
  #   '''
  #   For循環中執行步驟：
  #   （1）循環遍歷，將1000個子進程添加到進程池（相對父進程會阻塞）
  #   （2）每次執行10個子進程，等一個子進程執行完後，立馬啟動新的子進程。（相對父進程不阻塞）
  #    apply_async為異步進程池寫法。異步指的是啟動子進程的過程，與父進程本身的執行（爬蟲操作）是異步的，
  #    而For循環中往進程池添加子進程的過程，與父進程本身的執行卻是同步的。
  #   '''
  #   # 維持執行的進程總數為10，當一個進程執行完後啟動一個新進程.
  #   pool.apply_async(run, args=(index, queue, result_queue,))
  #
  # pool.close()
  # pool.join()

  end = time.time()
  print('總耗時：%s' % (end - start))
  print('queue 結束大小 %d' % queue.qsize())
  print('result_queue 結束大小 %d' % result_queue.qsize())

  while result_queue.empty() is not True:
    print(result_queue.get())
