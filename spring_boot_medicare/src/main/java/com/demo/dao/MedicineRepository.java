package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Integer>{

	List<Medicine> findByBrand(String brand);


	List<Medicine> findByPurpose(String purpose);


	

}