import os
import re

if __name__ == '__main__':
    path = '/Users/tcwang/Documents/Coding/Python/web_backup/秋元真夏 blog'
    reg = '秋元真夏 blog 140430'
    files = [f for f in os.listdir(path) if re.match(reg, f)]
    print(files)
    print(len(files))