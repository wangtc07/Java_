from selenium import webdriver
from selenium.webdriver.chrome.service import Service

# url = 'https://www.google.com.tw/?hl=zh_TW'
from selenium.webdriver.common.by import By

url = 'https://www.baidu.com/'

s = Service(r"./chromedriver")
browser = webdriver.Chrome(service=s)

browser.get(url)

input = browser.find_element(By.ID, 'su')

# 取得 class 屬性值
print(input.get_attribute('class'))

# 取得標籤名
print(input.tag_name)

# 元素文本
link = browser.find_element(By.LINK_TEXT, '新闻')
print(link.text)
