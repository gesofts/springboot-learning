实现的功能主要包含如下
1. git上管理配置文件，文件名为config
2. 创建config服务器，获取git上的配置文件信息
3. client发送请求道config服务器，获取配置信息
4. 最终实现分布式配置管理

如何运行
修改ConfigServer的application.properties
填入你自己的github仓库，账号密码及配置所在目录即可运行。

运行环境 jdk1.7

