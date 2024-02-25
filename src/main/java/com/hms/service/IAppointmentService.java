package com.hms.service;

import org.springframework.http.ResponseEntity;

import com.hms.model.Appointment;

public interface IAppointmentService {
	
	ResponseEntity<String> bookAppointment(Appointment appointment);

}
