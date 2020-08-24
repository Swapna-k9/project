package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CategoryRepository;
import com.demo.model.Category;
import com.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository dao;

	@Override
	public Category addCategory(Category category) {
		
		return dao.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		
		return dao.save(category);
	}

	@Override
	public Category getCategoryById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void deleteCategoryById(int id) {
		
		dao.deleteById(id);
	}

	@Override
	public List<Category> getAllCategory() {
		
		return dao.findAll();
	}

}
