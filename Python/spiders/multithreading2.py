from bs4 import BeautifulSoup
import requests
import time
import concurrent.futures

# https://blog.51cto.com/u_15446870/4731084#_2
# 爬取文章標題
def scrape(url):
  new_urls = []
  print(url)
  time.sleep(1)
  new_urls.append(str(url + 10))

  # ruls = open('multithreading2.text', 'r', encoding='UTF-8').read() + '\n'.join(
  #   new_urls)

  open('multithreading2_' + str(url) + '.text', 'w').write('\n'.join(
      new_urls))


urls = [1, 2, 3, 4, 5]  # 1~5頁的網址清單

start_time = time.time()  # 開始時間

# 同時建立及啟用10個執行緒
# 一次進一條url
# return wait download list
with concurrent.futures.ThreadPoolExecutor(max_workers=10) as executor:
  executor.map(scrape, urls)
# scrape(urls)

end_time = time.time()
print(f"{end_time - start_time} 秒爬取 {len(urls)} 頁的文章")
