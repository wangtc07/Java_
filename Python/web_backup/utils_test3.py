import utils

i = 1
url = '/s/n46/diary/MEMBER/list?ima=3233&page=' + str(
    i) + '&ct=36753&cd=MEMBER'


re_domain = utils.replace_domain(url, '')
print(re_domain)

n_url = utils.re_link_path(re_domain)
print(n_url)


png = '/files/46/assets/img/blog/none.png'
png_path = utils.re_link_path(png)
print(png_path)