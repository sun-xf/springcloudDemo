package com.sun;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @EnableZuulProxy 开启Zuul 的API网关服务功能
 *
 */
@EnableZuulProxy
@SpringCloudApplication
public class GateWayApp {
	public static void main(String[] args) {
		SpringApplication.run(GateWayApp.class, args);
		System.out.println("----------- GateWayApp start success! --------------");
	}
}
