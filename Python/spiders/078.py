from selenium import webdriver
from selenium.webdriver.chrome.service import Service

# url = 'https://tw.jd.com/'
url = 'http://dcimg.awalker.jp/v/Z6Vc1KceyQ1I5cLrZ0K0ddMTY3rlwD1FlxEXcV7AnaNAnqGctPVv3l4mJqRZbYsDIZ6cmPGKruNCo7T2oWfHosp5ciQfKBA3wTbgg0EPp6cVWs26gkX4Gd3mb7t1LK19QVSBEHWs6X9j5uvBTQDwcCcXiBZQLQqd3m7syBt3nKGEHaLOQMBHxBdjgjrPC9IiPOHCJ9BF'

# url = 'https://www.youtube.com/'

path = './chromedriver'
# 棄用
# browser = webdriver.Chrome(path)

s = Service(r"./chromedriver")
browser = webdriver.Chrome(service=s)

# 訪問網站
browser.get(url)

p = browser.get_cookie('PHPSESSID')
print(p)
print(p['value'])
print('--------------------------------------------------')
content = browser.page_source
# print(content)