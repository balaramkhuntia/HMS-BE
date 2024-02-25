package com.hms.service;

import org.springframework.http.ResponseEntity;

import com.hms.model.Patient;

public interface IPatientService {
	ResponseEntity<String> registerPatient(Patient patient);


}
