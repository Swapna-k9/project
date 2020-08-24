package com.demo.service;

import java.util.List;

import com.demo.model.Category;


public interface CategoryService {

	public Category addCategory(Category category);
	public Category updateCategory(Category category);
	public Category getCategoryById(int id);
	public void deleteCategoryById(int id);
	public List<Category> getAllCategory();
}
