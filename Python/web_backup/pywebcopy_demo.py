from pywebcopy import save_webpage

# https://pypi.org/project/pywebcopy/
save_webpage(
    url="https://www.nogizaka46.com/s/n46/diary/detail/65326?ima=0105",
    project_folder="/Users/tcwang/Downloads/web_backup",
    project_name="my_site",
    bypass_robots=True,
    debug=True,
    open_in_browser=True,
    delay=None,
    threaded=False,
)
