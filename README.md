# 微服务基础框架

> Author: Owen Jia    
  Email:  owen-jia@outlook.com

借用cloud-parent工程，可以快速构建完整的微服务应用体系。

---
2.0时代
- 注册中心、配置中心，均采用 nacos 替代eruka
- spring boot & cloud 版本升级至 spring cloud alibaba版本
- 访问及流量控制采用 sentinal 方案
- jdk8 升级 openjdk11

---

## 核心组建

1. Spring Cloud Gateway：网关
2. Nacos：服务注册和配置中心
3. Sentinel：熔断限流
4. Seata：分布式事务
5. RocketMQ：消息队列，削峰填谷
6. Docker：使用Docker进行容器化部署
7. Kubernetes：使用k8s进行容器化部署

## 依赖资源

Nacos 服务端 2.1.0 版本  
https://github.com/alibaba/nacos/releases/tag/2.1.0

Seata 服务端 1.5.1 版本  
https://github.com/apache/incubator-seata/releases/tag/v1.5.1

RocketMQ 服务端 4.9.4 版本  
MySQL 服务端 5.7 版本  
