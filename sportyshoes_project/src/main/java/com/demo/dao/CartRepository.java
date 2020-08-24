package com.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

	

}
