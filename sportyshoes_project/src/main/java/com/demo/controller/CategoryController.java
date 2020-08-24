package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.model.Category;
import com.demo.service.CategoryService;


public class CategoryController{

	@Autowired
	private CategoryService service;

	@PostMapping("/category")
	public Category addCategory(@RequestBody Category category) {
	
		return service.addCategory(category);
	}

	@PutMapping("/category")
	public Category updateCategory(@RequestBody Category category) {
		
		return service.updateCategory(category);	}

	@GetMapping("/category/{id}")
	public Category getCategoryById(@PathVariable int id) {
		
		return service.getCategoryById(id);
	}

	@DeleteMapping("/category/{id}")
	public void deleteCategoryById(int id) {
		service.deleteCategoryById(id);
		
	}

	@GetMapping("/category")
	public List<Category> getAllCategory() {
		
		return service.getAllCategory();
	}
}
