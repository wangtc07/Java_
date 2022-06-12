import requests

url = 'https://www.nogizaka46.com/s/n46/diary/MEMBER/list?ima=4119&ct=36753'

response = requests.get(url=url)
# 設定編碼格式
response.encoding = 'UTF-8'

# 一個類型和六個屬性
print(type(response))
# <class 'requests.models.Response'>

# 以字符串返回網頁源碼
print(response.text)

# 返回 url
print(response.url)

# 返回二進制的數據 b'
print(response.content)

# 響應的狀態碼
print(response.status_code)

# 響應頭
print(response.headers)