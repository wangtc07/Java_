import re
import time
import requests
import threading
from lxml import etree
from bs4 import BeautifulSoup
from queue import Queue
from threading import Thread


def run(in_q, out_q):
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
    data = requests.get(url=in_q.get(), headers=headers)
    r = data.content
    content = str(r, encoding='utf-8', errors='ignore')
    soup = BeautifulSoup(content, 'html5lib')
    fixed_html = soup.prettify()
    html = etree.HTML(fixed_html)
    nums = html.xpath('//div[@class="col-md-1"]//text()')
    for num in nums:
      num = re.findall('[0-9]', ''.join(num))
      real_num = int(''.join(num))
      out_q.put(str(threading.current_thread().getName()) + '-' + str(real_num))
    in_q.task_done()


if __name__ == '__main__':
  start = time.time()
  queue = Queue()
  result_queue = Queue()
  for i in range(0, 10):
    queue.put('https://www.nogizaka46.com/s/n46/diary/MEMBER/list?page=0&ct=36753'+str(i))

  print(str(queue))