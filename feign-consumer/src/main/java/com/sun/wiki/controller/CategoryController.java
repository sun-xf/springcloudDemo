package com.sun.wiki.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.wiki.entity.Category;
import com.sun.wiki.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	//http://localhost:9001/loadCategoryFeign
	@RequestMapping("/loadCategoryFeign")
	public List<Category> loadCategory(){
		return categoryService.loadCategory();
	}
}
