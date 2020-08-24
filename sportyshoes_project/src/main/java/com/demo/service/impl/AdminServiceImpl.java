package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AdminRepository;

import com.demo.model.Admin;

import com.demo.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private 	AdminRepository dao;

	@Override
	public Admin addAdmin(Admin admin) {
		
		return dao.save(admin);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		
		return dao.save(admin);
	}

	@Override
	public List<Admin> getAllAdmins() {
		
		return dao.findAll();
	}

	
}
