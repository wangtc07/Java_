import os
import time
import filedate


def modify_file_time(file_path, timestr):
  strFormat = "%Y-%m-%d %H:%M:%S.%f"
  datetime_obj = time.mktime(time.strptime(timestr, "%Y.%m.%d %H:%M"))
  stinfo = os.stat(file_path)
  os.utime(file_path, (stinfo.st_mtime, datetime_obj))

if __name__ == '__main__':
  path = '/Users/tcwang/Documents/Coding/Python/web_backup/yuna_single/2020.04.27 19:18 自己紹介は最後かな  柴田柚菜.html'

  modify_file_time(path, '2020.04.27 19:18')
  # file = filedate.File(path)
  # file.set(
  #     created="2020.04.27 19:18",
  # )
  # after = filedate.File(path)
  # print(after.get())
  
