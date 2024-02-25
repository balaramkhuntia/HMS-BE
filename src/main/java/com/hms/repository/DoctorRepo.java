package com.hms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.model.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {

	Optional<Doctor> findByName(String doctorName);
	Optional<Doctor> findByDisease(String diseaseSpecialization);
	
	
	
}
