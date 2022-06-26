from selenium import webdriver
from selenium.webdriver.chrome.service import Service

# url = 'https://tw.jd.com/'
url = 'http://dcimg.awalker.jp/i/6hFRpVkeeZQGol0FirjaMGGxhCstxFOp0wdkCcM0vl5xX7wSp3RlyZjeBvhHPRUh6SG5bdMFTrEADDS0v16Y4LmrSOFlxnFviPuOXV5KKGOzqC0g282YZlCdo6SDC1llWPTQhM1m2sYyGiqnORA8m2HcT1Sx4vVfYpUKb1Cy2DxMONs1EZ1vP2ahj6JJ3heSyK2WbyEo'

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