实现的功能主要包含如下
1. git上管理配置文件，文件名为config
2. 创建config服务器，获取git上的配置文件信息
3. client发送请求道config服务器，获取配置信息
4. 结合RabbitMQ自动更新配置信息

运行环境：jdk1.7

如何运行
1.修改ConfigServer的appliction.properties（改成你的github仓库和配置目录；修改你的github账号密码）
2.发送post请求给ConfigServer(http://localhost:24/bus/refresh)
3.post请求可以下载postman插件发送
4.发送请求完，再次启动client，获取信息http://localhost:8080/info/
5.可以看到github信息变更


