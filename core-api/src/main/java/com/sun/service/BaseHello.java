package com.sun.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.domain.User;

@RequestMapping("/refactor")
public interface BaseHello {

	@RequestMapping("/hello2")
    public String hello2();
    
    @RequestMapping("/hello3")
    public User printUser(@RequestBody User user);
}
