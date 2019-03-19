package com.sun.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.domain.User;
import com.sun.feign.service.FeignConsumerService;

@RestController
public class FeignConsumerController {

	@Autowired
	private FeignConsumerService consumerService;

	@RequestMapping("feign-consumer")
	public String feignConsumer() {
		consumerService.hello();
		return "feign consumer call finished!!!";
	}

	@RequestMapping("feign-consumer-user")
	public User feignConsumer2(User user) {
		consumerService.hello2();
		return consumerService.printUser(user);
	}
}
