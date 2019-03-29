各子项目介绍如下：
Spring Cloud Config 它用来为分布式系统中的基础设施和微服务提供集中化的外部配置支持，分为服务端和客户端两个部分。
config-client：客户端是微服务架构中的各个微服务应用或基础设施，它们通过制定的配置中心来管理应用资源与业务相关的配置内容，
并在启动的时候从配置中心获取和加载配置信息。
config-server：服务端也称为分布式配置中心，他是独立的微服务应用，用来连接配置仓库并为客户端提供获取接口(这些接口返回配置信息、加密、解密信息等)。

core-api：用于存放domain（实体类），用于服务端和消费端使用。

eureka：服务注册中心。

feign-consumer：使用feign实现声明式服务调用，需要在接口类上增加 @FeignClient(name="hello-service")，hello-service为调用的服务名，方法上增加
@RequestMapping注解，需要标明要调用的接口名称。

gateway-api：使用Zuul 实现API网关服务，它可以维护路由规则和服务实例。还可以做一些校验，比如登录校验。

hello-consumer：此项目只是演示项目，一般不建议这样使用。

hello-service：服务端项目，已集成Mybatis。

sleuth-zipkin：使用spring cloud sleuth整合zipkin进行服务链路追踪。
