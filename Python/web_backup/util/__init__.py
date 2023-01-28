import os
import re


def filter_jpg(src):
    gif_reg = re.compile(r".*\.gif")
    if gif_reg.match(src):
        return False

    return True


if __name__ == '__main__':
    # path = '/Users/tcwang/Documents/Coding/Python/web_backup/秋元真夏 blog'
    # reg = '秋元真夏 blog 140430'
    # files = [f for f in os.listdir(path) if re.match(reg, f)]
    # print(files)
    # print(len(files))

    arr = ['/files/46/_pre/blog/photos/uncategorized/2011/12/14/0026.gif',
            '/files/46/_pre/blog/photos/uncategorized/2011/12/14/0026.jpg']

    print(arr)

    arr = filter(filter_jpg, arr)

    # for i in list:
    #     print(i)

    print(arr)
    vowels = list(arr)

    print(vowels)
