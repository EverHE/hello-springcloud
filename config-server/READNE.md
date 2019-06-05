配置中心

项目启动的时候，config配置中心并不会拉取远程git仓库的配置文件到本地，只有第一次访问的时候，才会远程拉取并存储到本地。

#占位符
{application},{profile},{label}

spring.cloud.config.server.git.uri=http://git.oschina.net/zhihaomiao/{application}
{application}代表了应用名，所以当客户端应用向config server发起获取配置的请求时，Config server会根据客户端的spring.application.name信息来填充{application}占位符以定位配置资源的存储位置，从而实现根据微服务应用的属性动态获取不同的配置。另外，在这些占位符中，{label}参数较为特别，如果git的分支和标签名包含"/"，那么{label}参数在http的url中应该使用"(_)"来代替，以避免改变了url含义，指向到其他的url资源。



https://www.jianshu.com/p/6dfd1ab93596