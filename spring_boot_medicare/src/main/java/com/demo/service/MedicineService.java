package com.demo.service;

import java.util.List;

import com.demo.model.Medicine;

public interface MedicineService {
	
	public Medicine addMedicine(Medicine medicine);
	public Medicine updateMedicine(Medicine medicine);
	public Medicine getMedicineById(int id);
	public void deleteMedicineById(int id);
	public List<Medicine> getAllMedicines();
	public List<Medicine> getAllMedicinesByBrand(String brand);
	public List<Medicine> getAllMedicinesByPurpose(String purpose);
}