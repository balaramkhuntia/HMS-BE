package com.hms.service;

import org.springframework.http.ResponseEntity;

import com.hms.model.Doctor;

public interface IDoctorService {

	ResponseEntity<String> registerDoctor(Doctor doctor);

}
