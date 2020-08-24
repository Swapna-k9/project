package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Shoe;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Integer> {

	List<Shoe> findByBrand(String brand);

	List<Shoe> findByColor(String color);

}
