package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.model.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine, Integer>{
	

}
