package com.sun.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.domain.User;
import com.sun.service.BaseHello;

//@RestController注解的类，方法不能返回html和jsp。
@RestController
public class HelloController implements BaseHello{
	Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
    private DiscoveryClient discoveryClient;
	
	@RequestMapping("/hello")
    public String hello() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        //打印服务的服务id
        logger.info("*********" + instance.getServiceId());
        return "hello,this is hello-service";
    }

	@Override
	public String hello2() {
		return "hello,this is hello2-service";
	}

	@Override
	public User printUser(User user) {
		return user;
	}
}
