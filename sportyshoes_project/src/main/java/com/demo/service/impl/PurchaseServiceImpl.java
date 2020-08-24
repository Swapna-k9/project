package com.demo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.PurchaseRepository;
import com.demo.model.Purchase;
import com.demo.service.PurchaseService;

@Service

public class PurchaseServiceImpl implements PurchaseService {
	
	@Autowired
	private PurchaseRepository dao;

	@Override
	public Purchase addPurchase(Purchase purchase) {
		return dao.save(purchase);
	}

	@Override
	public Purchase updatePurchase(Purchase purchase) {
		return dao.save(purchase);
	}

	@Override
	public void deletePurchaseById(int id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Purchase> getAllPurchases() {
		return dao.findAll();
	}

	@Override
	public List<Purchase> getAllPurchasesByDate(Date date) {
		return dao.findByDate(date);
	}

}
