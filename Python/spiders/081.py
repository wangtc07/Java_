from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import time

url = 'https://www.baidu.com/'

s = Service(r"./chromedriver")
browser = webdriver.Chrome(service=s)

browser.get(url)

time.sleep(2)

# 輸入關鍵字
input = browser.find_element(By.ID, 'kw')
input.send_keys('周杰倫')
time.sleep(2)

# 點擊按鈕
btn = browser.find_element(By.ID, 'su')
btn.click()
time.sleep(2)

# 滑到底部
js_bottom = 'document.documentElement.scrollTop=100000'
browser.execute_script(js_bottom)
time.sleep(2)

# 獲取下一頁
next = browser.find_element(By.XPATH, '//a[@class="n"]')
next.click()
time.sleep(2)

# 回到上一頁
browser.back()
time.sleep(2)

# 下一頁
browser.forward()
time.sleep(2)
