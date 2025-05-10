# 项目简介

基于 Spring Cloud Alibaba 的微服务架构实践项目，项目包含以下核心微服务模块：

- ```model```：公用实体类
- ```service-order```：订单服务
- ```service-product```：产品服务

# 技术栈

| 组件 | 版本 | 作用 |
|------|------|------|
| **Java** | 17 | 项目运行基础环境 |
| **Spring Boot** | 3.2.4 | 快速构建独立运行的 Spring 应用，简化配置和依赖管理 |
| **Spring Cloud** | 2023.0.1 | 实现微服务架构的核心框架，提供服务注册发现、配置中心、网关等功能 |
| **Spring Cloud Alibaba** | 2023.0.1.0 | 阿里生态中间件整合包，支持 Nacos、Sentinel、RocketMQ、Seata 等组件 |
| **Sentinel** | 1.8.6 | 分布式系统的流量防护组件，提供熔断降级、限流、系统负载保护等功能 |
| **Nacos** | 2.3.2 | 服务注册与发现中心，同时支持动态配置管理（替代传统配置文件） |
| **RocketMQ** | 5.1.4 | 分布式消息队列，实现服务间异步通信和解耦 |
| **Seata** | 2.0.0 | 分布式事务解决方案，支持 AT、TCC、Saga 等事务模式 |

# 参考资料
- [完整springcloudalibaba项目搭建教程（新手入门）](https://blog.csdn.net/cl617287/category_12383102.html)
- [尚硅谷2025最新SpringCloud教程，springcloud从入门到大牛](https://www.bilibili.com/video/BV1UJc2ezEFU)
- [IDEA项目如何上传至GitHub](https://blog.csdn.net/m0_73972962/article/details/146198392)