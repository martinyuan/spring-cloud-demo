# spring-cloud-demo
## 实例项目，计算加法。
## 1、eureka-server项目@EnableEurekaServer
### java -jar target/eureka-server-0.0.1.jar --spring.profiles.active=peer1
### java -jar target/eureka-server-0.0.1.jar --spring.profiles.active=peer2
## 2、compute-service @EnableDiscoveryClient
## 3、compute-ribbon @EnableDiscoveryClient @LoadBalanced
## 4、config-server @EnableConfigServer
## 5、api-gateway @EnableZuulProxy @SpringCloudApplication (认证服务)
### 服务注册中心地址 http://localhost:1111  [eureka-server]
### 服务提供地址：http://localhost:2222 , http://localhost:2223 (两台服务提供者) [compute-service]
### 服务消费地址：http://localhost:3333/add (刷新观察console) [compute-ribbon]
### 配置服务地址：http://localhost:7001/app-dev.properties (支持本地配置、git配置) [config-server]
### 服务网关地址：http://localhost:5555/api-a/add?a=1&b=5&accessToken=rr（accessToken认证服务） [api-gateway]



