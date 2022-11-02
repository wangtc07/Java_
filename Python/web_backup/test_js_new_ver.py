import utils
import re
import os
import requests
from bs4 import BeautifulSoup
import urllib.request


if __name__ == '__main__':
    # blog 內容
    url = 'https://www.nogizaka46.com/s/n46/diary/detail/100819?ima=1536&cd=MEMBER'

    un_download_rul = utils.download(url)