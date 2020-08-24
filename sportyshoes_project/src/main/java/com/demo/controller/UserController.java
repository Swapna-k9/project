package com.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.model.User;

import com.demo.service.UserService;


public class UserController{

	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		
		return service.addUser(user);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		
		return service.addUser(user);
	}

	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable int id) {
		
		return service.getUserById(id);
	}
	@DeleteMapping("/user/{id}")
	public void deleteUserById(@PathVariable int id) {
		service.deleteUserById(id);
		
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		
		return service.getAllUsers();
	}

	@GetMapping("/users/date/{date}")
	public List<User> getAllUsersByDate(int date) {
		
		return service.getAllUsersByDate(date);
	}

}
