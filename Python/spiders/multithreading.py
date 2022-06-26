from bs4 import BeautifulSoup
import requests
import time
import concurrent.futures


# 爬取文章標題
def scrape(urls):
  print('urls: ', urls)
  new_urls = []
  for url in urls:
    print(url)
    time.sleep(1)
    new_urls.append(str(url + 10))

  open('multithreading' + str(urls[0]) + '.text', 'w').write(
    '\n'.join(new_urls))


base_url = "https://www.inside.com.tw/tag/AI"
urls = [1, 2, 3, 4, 5]  # 1~5頁的網址清單

start_time = time.time()  # 開始時間

# 同時建立及啟用10個執行緒
with concurrent.futures.ThreadPoolExecutor(max_workers=10) as executor:
  executor.map(scrape, urls)
# scrape(urls)

end_time = time.time()
print(f"{end_time - start_time} 秒爬取 {len(urls)} 頁的文章")
