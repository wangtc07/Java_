import utils
import re

url = 'https://www.youtube.com/watch?v=V9D5rbLyIsM'


re_domain = utils.replace_domain(url, '')

n_url = utils.re_ima_set_folder_path(re_domain)
print(n_url)

other_domain = re.compile(r"^https")
if other_domain.match(re_domain):
  print(url)