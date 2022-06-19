from bs4 import BeautifulSoup

soup = BeautifulSoup(open('075.html', encoding='UTF-8'), 'lxml')

# print(soup)

# 根據標籤名查找節點
# print(soup.a)  # 第一個符合條件的數據
# print(soup.a.attrs)  # 數據的屬性
# print('\n')

# 函數
# print(soup.find('a'))  # 第一個符合條件的數據
# print(soup.find('a', title='llc'))  # 根據 title 的值，找到對應的標籤
# print(soup.find('a', class_='n46'))
# print('\n')
#
# print(soup.find_all('a'))
# print(soup.find_all(['a', 'span']))  # 獲取多個標籤
# print(soup.find_all('li', limit=2))  # 找前幾個數據
# print('\n')
#
# print(soup.select('a'))  # 獲取多個標籤
# print(soup.select('.n46'))  # 通過css選擇器獲取
# print(soup.select('#n46'))
# print(soup.select('li[id]'))
# print(soup.select('li[id=miyu]'))


# data = soup.select('div[data-src]')
# print(data)
# print(len(data))

link = soup.find_all('link',
 attrs={"rel": ["preload", "apple-touch-icon", "icon", "manifest", "mask-icon"]})
# "class": "apple-touch-icon",
# "class": "icon",
# "class": "manifest",
# "class": "mask-icon"
# link = soup.select('link[rel=preload, rel=icon]')
print(len(link))

# js = soup.find_all('script', src=True)
# print(js)

# list = soup.select('.bl--card.js-pos.a--op.hv--thumb')
# print(len(list) , '  ::')

# data-src
# data2 = soup.find_all(attrs={'data-src': True})
# print(data2)
# print(len(data2))

# for data in data2:
#   # 取得 data-src 屬性
#   src = data['data-src']
#   # 有 domain -> https://www.nogizaka46.com/files/46/diary/n46/MEMBER/0000_11.jpeg
#   # 沒有 domain -> /files/46/assets/img/blog/none.png
#   print(src)
#   style = 'background-image: url("' + src + '";)'
#   data['style'] = style
#
# print(soup.prettify())
