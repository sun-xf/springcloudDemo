package com.sun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	/**
	 * 通过@Value 来将配置文件中的值写入到代码中
	 */
	@Value("${from}")
	private String from;

	@RequestMapping("/from")
	public String from() {
		return from;
	}
}
