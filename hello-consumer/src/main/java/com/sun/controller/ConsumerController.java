package com.sun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.service.ConsumerService;

@RestController
public class ConsumerController {
	@Autowired
	private ConsumerService consumerService;

	@RequestMapping("/hello-consumer")
	public String helloConsumer() {
		return consumerService.consumer();
	}
}
