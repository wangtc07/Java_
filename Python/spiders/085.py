import requests
import json
# post 請求

url = 'https://fanyi.baidu.com/sug'
headers = {
  'user-agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.127 Safari/537.36',
}

data = {
  'kw': 'japan',
}

# url 請求地址
# data 請求參數
# kwargs 字典
response = requests.post(url=url, data=data, headers=headers)
# 設定編碼格式
response.encoding = 'UTF-8'

content = response.text
obj = json.loads(content)

print(obj)


