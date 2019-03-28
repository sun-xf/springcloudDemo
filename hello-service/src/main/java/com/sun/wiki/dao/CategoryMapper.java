package com.sun.wiki.dao;

import java.util.List;

import com.sun.wiki.entity.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(String id);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
    
    List<Category> loadCategory();
}