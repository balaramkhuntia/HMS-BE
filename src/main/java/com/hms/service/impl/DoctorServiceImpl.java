package com.hms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.model.DiseaseSpecialization;
import com.hms.model.Doctor;
import com.hms.repository.DoctorRepo;
import com.hms.request.DoctorReq;
import com.hms.response.DoctorRes;
import com.hms.service.IDoctorService;

@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public DoctorRes registerDoctor(DoctorReq doctorReq) {

//		Doctor doctor = new Doctor();
//		doctor.setDoctorName(doctorReq.getDoctorName());
//		doctor.setDob(doctorReq.getDob());
//
//		DiseaseSpecialization diseaseSpecialization = new DiseaseSpecialization();
//		doctor.setDiseaseSpecialization(diseaseSpecialization);
//		doctor.setAppointment(null);
//		doctorRepo.save(doctor);

		return null;

	}

}
