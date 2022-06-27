import utils


url = 'https://www.nogizaka46.com/s/n46/diary/detail/56833?ima=2825&cd=MEMBER'

wait_urls = utils.download(url)

for wait_url in wait_urls:
    print(wait_url)