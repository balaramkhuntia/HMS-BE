package com.hms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hms.model.Doctor;
import com.hms.repository.DoctorRepo;
import com.hms.service.IDoctorService;

@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public ResponseEntity<String> registerDoctor(Doctor doctor) {

		return null;
	}
}
