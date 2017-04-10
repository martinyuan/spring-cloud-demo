# spring-cloud-demo
## 实例项目，计算加法。
## 1、eureka-server项目@EnableEurekaServer
## 2、compute-service @EnableDiscoveryClient
## 3、compute-ribbon @EnableDiscoveryClient @LoadBalanced
## 4、config-server @EnableConfigServer
## 5、api-gateway @EnableZuulProxy @SpringCloudApplication (认证服务)
### 服务注册中心地址 http://localhost:1111
### 服务提供地址：http://localhost:2222 , http://localhost:2223 (两台服务提供者)
### 服务消费地址：http://localhost:3333/add (刷新观察console)
### 配置服务地址：http://localhost:7001/app-dev.properties (支持本地配置、git配置)
### 服务网关地址：http://localhost:5555/api-a/add?a=1&b=5&accessToken=rr（accessToken认证服务）

