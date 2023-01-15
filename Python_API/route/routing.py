from flask import Blueprint, request

from service import blog_single

param = Blueprint('param', __name__)



@param.route('/data/appInfo/<name>', methods=['GET'])
def query_data_msg_by_name(name):
    print("type(name) : ", type(name))
    return 'String => {}'.format(name)


@param.route('/post', methods=['POST'])
def post_route():
    req: dict = request.json
    url = req.get('url')
    print(url)
    return url


@param.route('/get', methods=['GET'])
def get_route():
    req: dict = request.json
    url = req.get('url')
    print(url)
    return url


@param.route('/blog_single/<url>')
def blog_single_route(url: str):
    blog_single.download(url)
    return None
