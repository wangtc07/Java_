from selenium import webdriver
from selenium.webdriver.chrome.service import Service

url = 'https://tw.jd.com/'
# url = 'https://www.youtube.com/'

path = './chromedriver'
# 棄用
# browser = webdriver.Chrome(path)

s = Service(r"./chromedriver")
browser = webdriver.Chrome(service=s)

# 訪問網站
browser.get(url)
content = browser.page_source
print(content)