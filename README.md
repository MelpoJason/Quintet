## Thanks for reading the Quintet Instruction book

项目启动前
    需要配置backend中 build.gradle 中flyway的数据源配置 以及properties文件中的数据源配置
    需要配置frontend中的 package.json和angular-cli中相应的指令，然后`npm install`安装相关的依赖

启动python scrapy爬虫：
    -`cd dataMining`
    -`scrapy genspider example example.com`