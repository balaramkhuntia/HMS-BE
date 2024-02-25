package com.hms.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hms.model.Appointment;
import com.hms.service.IAppointmentService;

@Service
public class AppointmentServiceImpl implements IAppointmentService {

	@Override
	public ResponseEntity<String> bookAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return null;
	}

}
