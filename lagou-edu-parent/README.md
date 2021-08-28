# Distributed-project
分布式实战项目
## 1. 用户服务开发
## 2. 课程订单服务开发
## 3. 留言服务开发

### 技术选型：

| **技术名称** | **说明**                                                     |
| ------------ | ------------------------------------------------------------ |
| Web层        | 借助springmvc接收请求，进行视图跳转                          |
| Service层    | 借助spring进行IOC、AOP、及事务管理                           |
| dao层        | 借助mybatis进行数据库交互                                    |
| EasyCode插件 | IDEA快速生成实体类的插件                                     |
| Zookeeper    | 服务注册与服务发现                                           |
| Dubbo        | 分布式框架，远程RPC调用                                      |
| Redis        | 内存数据库，缓存                                             |
| Lombok       | 消除实体类中冗余的get和set                                   |
| SpringSocial | SpringSocial (Spring社交)，简单理解就是和第三方应用打交道，微信登录用 |

### **项目开发环境**：

-  开发工具
  - 后端: IDEA
- 开发环境
  - JDK 8
  - Maven 3.8.1
  - MySQL 5.7
  - Zookeeper 3.6.0
  - Dubbo 2.5.7
  - Redis 5.0.4
