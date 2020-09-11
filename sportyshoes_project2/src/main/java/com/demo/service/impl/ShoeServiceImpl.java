package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ShoeRepository;
import com.demo.model.Shoe;
import com.demo.service.ShoeService;

@Service
public class ShoeServiceImpl implements ShoeService {

	@Autowired
	private ShoeRepository dao;
	
	@Override
	public Shoe addShoe(Shoe shoe) {
		
		return dao.save(shoe);
	}

	@Override
	public Shoe updateShoe(Shoe shoe) {
		return dao.save(shoe);
	}

	@Override
	public Shoe getShoeById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void deleteShoeById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Shoe> getAllShoes() {
		
		return dao.findAll();
	}

	@Override
	public List<Shoe> getAllShoesByBrand(String brand) {
		
		return dao.findByBrand(brand);
	}

	@Override
	public List<Shoe> getAllShoesByColor(String color) {
		
		return dao.findByColor(color);
	}

}
