package com.sun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sun.service.ConsumerService;

@Service
public class ConsumerServiceImpl extends AbstractService implements ConsumerService {
	// 这里注入的restTemplate就是在com.sun.ConsumerApp中通过@Bean配置的实例
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "errorMsg")
	@Override
	public String consumer() {
		// 调用hello-service服务，注意这里用的是服务名，而不是具体的ip+port
		restTemplate.getForObject("http://hello-service/hello", String.class);
		return "hello consumer finish !!!";
	}
}
