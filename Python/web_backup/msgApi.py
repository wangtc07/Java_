import json
import urllib.request
from io import BytesIO
import gzip

def create_request(url):


  print(url)

  headers = {
    'Accept': '*/*',
    'Accept-Encoding': 'br;q=1.0, gzip;q=0.9, deflate;q=0.8',
    'Accept-Language': 'ja-TW;q=1.0, zh-Hant-TW;q=0.9, en-JP;q=0.8',
    'Authorization': 'Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2NjIzMDM1MDAsInN1YiI6IjE0NTgwIn0.SWhDk8E1KYIRiUdryaNRdW9bNdm2eb7JVcNUIemk8tI',
    'Connection': 'keep-alive',
    'Host': 'api.n46.glastonr.net',
    'User-Agent': 'Hot/1.3.02 (jp.co.sonymusic.communication.nogizaka; build:134; iOS 15.6.1) Alamofire/5.6.1',
    'X-Talk-App-ID': 'jp.co.sonymusic.communication.nogizaka 2.2',
  }

  request = urllib.request.Request(url=url, headers=headers)

  return request


# https://blog.51cto.com/u_15724848/5497802
# 'utf-8' codec can't decode byte 0x8b in position 1: invalid start byte
def get_content(request):
  response = urllib.request.urlopen(request)
  # htmls = response.read()
  # buff = BytesIO(htmls)
  # f = gzip.GzipFile(fileobj=buff)
  # content = f.read().decode('utf-8')
  content = response.read()
  return content

if __name__ == '__main__':
    request = create_request('https://api.n46.glastonr.net/v2/messages/18856')
    content = get_content(request)
    print(content)
    obj = json.loads(content)
    print(obj)
    url = obj['file']
    print(url)
    video = create_request(url)
    urllib.request.urlretrieve(video, 'sakura.mp4')
