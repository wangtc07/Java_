from selenium import webdriver
from selenium.webdriver.chrome.service import Service

# url = 'https://www.google.com.tw/?hl=zh_TW'
from selenium.webdriver.common.by import By

url = 'https://www.baidu.com/'

s = Service(r"./chromedriver")
browser = webdriver.Chrome(service=s)

browser.get(url)

# 元素定位
# 棄用
# btn = browser.find_element_by_id('su')
btn = browser.find_element(By.ID, "su")
print(btn)

wd = browser.find_element(By.NAME, 'wd')
print(wd)

su = browser.find_element(By.XPATH, '//input[@id="su"]')
print(su)

# 獲取 a 標籤連結
link = browser.find_element(By.LINK_TEXT, '新闻')
print(link)