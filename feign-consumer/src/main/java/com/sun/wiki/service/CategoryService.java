package com.sun.wiki.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sun.wiki.entity.Category;

@FeignClient(name="hello-service")
public interface CategoryService  {

	@RequestMapping(value = "/loadCategory", method= RequestMethod.GET)
	public List<Category> loadCategory();
}
