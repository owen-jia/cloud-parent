# Cloud Parent 微服务基础服务模型

> Author: Owen Jia    
  Email:  owen-jia@outlook.com

## 核心库依赖版本
- CloudParent Version = 1.1.0
- SpringCloud Version = Hoxton.RELEASE
- SpringBoot Version = 2.2.1.RELEASE

## 子项目介绍

- cloud-service-discover 注册中心服务
- cloud-service-gateway 网关服务
- cloud-service-config 配置中心服务(本地存储方式)
- cloud-service-config-vault 采用Vault为存储后台的配置中心服务，Vault1.3.1
- cloud-service-demo1 消费者服务
- cloud-service-demo2 生产者服务

### cloud-service-discover

注册中心服务，基于eureka技术spring-boot构建，可以支持单节点部署和多节点的集群部署，一般生产环境推荐集群部署

### cloud-service-gateway

统一网关路由管理器，URI层面分为内外两个path统一由zuul进行分配代理；客户支持自定义安全处理等等逻辑

Gateway属于微服务架构必须的一环，是集群服务对外的URL入口。关注核心：统一安全策略、监控统计、流量弹性控制。

### cloud-service-config

采用本地filesystem方式管理配置文件，也支持Git、Svn方式

> 访问文件路径格式，例如：    
  http://localhost:8881/demo1/dev    
  http://localhost:8881/demo1-dev.yml       
  http://localhost:8881/service-config-server/demo1-dev.yml  

统一管理应用服务、基础服务中gateway的配置文件； discover集群服务配置和config服务器配置建议由服务自己管理配置文件（一般部署后很少会修改）；

### cloud-service-config-vault

采用Vault作为后台数据存储，项目目标是连接调试config如何与vault进行数据模型转换，以及大家一个基础的构建服务样本。
vault中数据采用json格式，通过demo1进行配置参数读取。

### cloud-service-demo1

消费服务测试Demo，调用demo2提供的接口

### cloud-service-demo2

生产服务测试Demo，对外提供接口

## 技术标准规范

Spring Cloud Doc：[Hoxton.RELEASE](https://cloud.spring.io/spring-cloud-static/Hoxton.RELEASE/reference/html/spring-cloud.html)

