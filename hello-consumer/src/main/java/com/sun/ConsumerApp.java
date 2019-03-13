package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 这里也要用到@EnableDiscoveryClient， 让服务使用eureka服务器， 实现服务注册和发现
 * @EnableCircuitBreaker 开启断路器
 * @SpringCloudApplication = @EnableDiscoveryClient + @SpringBootApplication + @EnableCircuitBreaker
 * @author Sunxf
 *
 */
@SpringCloudApplication
public class ConsumerApp {
	@Bean // @Bean 应用在方法上，用来将方法返回值设为为bean
	@LoadBalanced // @LoadBalanced实现负载均衡
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApp.class, args);
		System.out.println("-------------- ConsumerApp start success! -------------");
	}
}
