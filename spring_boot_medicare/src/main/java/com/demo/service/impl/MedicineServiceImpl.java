package com.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.MedicineRepository;
import com.demo.model.Medicine;
import com.demo.service.MedicineService;

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineRepository dao;
	
	@Override
	public Medicine addMedicine(Medicine medicine) {
		
		return dao.save(medicine);
	}

	@Override
	public Medicine updateMedicine(Medicine medicine) {
		return dao.save(medicine);
	}

	@Override
	public Medicine getMedicineById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void deleteMedicineById(int id) {
	
	dao.deleteById(id);	
	}

	@Override
	public List<Medicine> getAllMedicines() {
	
		return dao.findAll();
	}

	@Override
	public List<Medicine> getAllMedicinesByBrand(String brand) {
		
		return dao.findByBrand(brand);
	}

	@Override
	public List<Medicine> getAllMedicinesByPurpose(String purpose) {
		return dao.findByPurpose(purpose);
	}

	
}
