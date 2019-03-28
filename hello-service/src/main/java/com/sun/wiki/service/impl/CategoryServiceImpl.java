package com.sun.wiki.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.wiki.dao.CategoryMapper;
import com.sun.wiki.entity.Category;
import com.sun.wiki.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;
	
	@Override
	public List<Category> loadCategory() {
		return categoryMapper.loadCategory();
	}
}
