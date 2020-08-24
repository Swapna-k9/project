package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Shoe;
import com.demo.service.ShoeService;

@RestController
public class ShoesController {

	@Autowired
	private ShoeService service;
	
	@PostMapping("/shoe")
	public Shoe addShoe(@RequestBody Shoe shoe) {
		
		return service.addShoe(shoe);
	}

	@PutMapping("/shoe")
	public Shoe updateShoe(@RequestBody Shoe shoe) {
		
		return service.updateShoe(shoe); 
	}

	@GetMapping("/shoe/{id}")
	public Shoe getShoeById(@PathVariable int id) {
		
		return service.getShoeById(id) ;
	}

	@DeleteMapping("/shoe/{id}")
	public void deleteShoeById(@PathVariable int id) {
		service.deleteShoeById(id);
		
	}

	@GetMapping("/shoes")
	public List<Shoe> getAllShoes() {
		
		return service.getAllShoes();
	}

	@GetMapping("/shoes/brand/{brand}")
	public List<Shoe> getAllShoesByBrand(@PathVariable String brand) {
		return service.getAllShoesByBrand(brand);
		
	}
	

	@GetMapping("/shoes/color/{color}")
	public List<Shoe> getAllShoesByColor(String color) {
		return service.getAllShoesByColor(color);
	}

}