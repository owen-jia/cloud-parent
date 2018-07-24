## Cloud Parent 微服务框架

> Author: Owen Jia    
  Email:  owen-jia@outlook.com

> 服务依赖spring cloud 1.5.6.RELEASE(Dalston.SR4)

> 项目依赖spring boot & maven搭建

> 部署运行方式 java -jar xxx.jar

### 子项目介绍

- cloud-service-discover 注册中心服务
- cloud-service-gateway 网关服务
- cloud-service-config 配置中心服务
- cloud-service-demo1 消费者服务
- cloud-service-demo2 生产者服务


### cloud-service-discover

### cloud-service-gateway

> 统一网关路由管理器，URI层面分为内外两个path统一由zuul进行分配代理；客户支持自定义安全处理等等逻辑

### cloud-service-config

> 采用本地filesystem方式管理配置文件，也支持Git、Svn方式

> 访问文件路径格式，例如：    
  http://localhost:8881/demo1/dev    
  http://localhost:8881/demo1-dev.yml       
  http://localhost:8881/service-config-server/demo1-dev.yml  

> 统一管理应用服务、基础服务中gateway的配置文件； discover集群服务配置和config服务器配置建议由服务自己管理配置文件（一般部署后很少会修改）；

### cloud-service-demo1

> 消费服务测试Demo，调用demo2提供的接口

### cloud-service-demo2

> 生产服务测试Demo，对外提供接口


