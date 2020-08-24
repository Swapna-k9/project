package com.demo.service;

import java.util.Date;
import java.util.List;

import com.demo.model.Purchase;


public interface PurchaseService {
	
	public Purchase addPurchase(Purchase purchase);
	public Purchase updatePurchase(Purchase purchase);
	public void deletePurchaseById(int id);
	public List<Purchase> getAllPurchases();
	public List<Purchase> getAllPurchasesByDate(Date date);

}
