# spring-cloud-demo
## 实例项目，计算加法。
## 1、eureka-server项目@EnableEurekaServer
## 2、compute-service @EnableDiscoveryClient
## 3、compute-ribbon @EnableDiscoveryClient @LoadBalanced

### 服务注册中心地址 http://localhost:1111
### 服务提供地址：http://localhost:2222 , http://localhost:2223 (两台服务提供者)
### 服务消费地址：http://localhost:3333/add (刷新观察console)

