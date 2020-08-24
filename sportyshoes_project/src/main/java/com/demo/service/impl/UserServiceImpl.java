package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.UserRepository;
import com.demo.model.User;
import com.demo.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository dao;
	
	@Override
	public User addUser(User user) {
		
		return dao.save(user);
	}

	@Override
	public User updateUser(User user) {
		return dao.save(user);
	}

	@Override
	public User getUserById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public void deleteUserById(int id) {
		dao.deleteById(id);	
	}

	@Override
	public List<User> getAllUsers() {
		
		return dao.findAll();
	}

	@Override
	public List<User> getAllUsersByDate(int date) {
		return dao.findByDate(date);
	}

}
