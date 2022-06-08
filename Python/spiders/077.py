import urllib.request

url = 'https://tw.jd.com/'

response = urllib.request.urlopen(url)

constent = response.read().decode('UTF-8')

print(constent)