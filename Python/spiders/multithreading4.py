import re
import time
import requests
import threading
from lxml import etree
from bs4 import BeautifulSoup
from queue import Queue
from threading import Thread
import multiprocessing


def run(index, in_q, out_q):
  headers = {
    'Accept': '',
    'Accept-Language': 'zh-CN,zh;q=0.9,en;q=0.8',
    'Connection': 'keep-alive',
    'Cookie': '',
    'DNT': '1',
    'Host': 'www.g.com',
    'Referer': '',
    'Upgrade-Insecure-Requests': '1',
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 '
                  '(KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36'
  }
  while in_q.empty() is not True:
    print(index, '-------', in_q.get())
    time.sleep(4)
    # data = requests.get(url=in_q.get(), headers=headers)
    # r = data.content
    # content = str(r, encoding='utf-8', errors='ignore')
    # soup = BeautifulSoup(content, 'html5lib')
    # fixed_html = soup.prettify()
    # html = etree.HTML(fixed_html)
    # nums = html.xpath('//div[@class="col-md-1"]//text()')
    # for num in nums:
    #   num = re.findall('[0-9]', ''.join(num))
    #   real_num = int(''.join(num))
    #   out_q.put(str(threading.current_thread().getName()) + '-' + str(real_num))
    in_q.task_done()



if __name__ == '__main__':
  start = time.time()
  queue = multiprocessing.Manager().Queue()
  result_queue = multiprocessing.Manager().Queue()

  for i in range(1, 1001):
    queue.put('http://www.g.com2?page='+str(i))
  print('queue 開始大小 %d' % queue.qsize())

  pool = multiprocessing.Pool(10)  # 異步進程池（非阻塞）
  for index in range(1000):
    '''
    For循環中執行步驟：
    （1）循環遍歷，將1000個子進程添加到進程池（相對父進程會阻塞）
    （2）每次執行10個子進程，等一個子進程執行完後，立馬啟動新的子進程。（相對父進程不阻塞）
     apply_async為異步進程池寫法。異步指的是啟動子進程的過程，與父進程本身的執行（爬蟲操作）是異步的，
     而For循環中往進程池添加子進程的過程，與父進程本身的執行卻是同步的。
    '''
    pool.apply_async(run, args=(index, queue, result_queue,))   # 維持執行的進程總數為10，當一個進程執行完後啟動一個新進程.
  pool.close()
  pool.join()

  queue.join()  # 隊列消費完 線程結束
  end = time.time()

  print('總耗時：%s' % (end - start))
  print('queue 結束大小 %d' % queue.qsize())
  print('result_queue 結束大小 %d' % result_queue.qsize())

