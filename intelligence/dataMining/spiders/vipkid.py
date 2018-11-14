# -*- coding: utf-8 -*-
import scrapy


class VipkidSpider(scrapy.Spider):
    name = "vipkid"
    allowed_domains = ["b40-lc.vipkid.com.cn"]
    start_urls = ['http://b40-lc.vipkid.com.cn/']

    def parse(self, response):
        pass