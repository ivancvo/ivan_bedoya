from flask import Blueprint, render_template

mian_bp = Blueprint('main_bp', __name__)


@main_bp('/')
def home():
    return render_template('index.html')