package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.model.Cart;
import com.demo.service.CartService;

public class CartController{

	@Autowired
	private CartService service;
	
	@PostMapping("/cart")
	public Cart addCart(@RequestBody Cart cart) {
		
		return service.addCart(cart);
	}

	@PutMapping("/cart")
	public Cart updateCart(@RequestBody Cart cart) {
		
		return service.updateCart(cart);
	}

	@DeleteMapping("/cart/{id}")
	public void deleteCartById(@PathVariable int id) {
		
		service.deleteCartById(id);
	}

	@GetMapping("/carts")
	public List<Cart> getAllCarts() {
	
		return service.getAllCarts();
	}

	

}
