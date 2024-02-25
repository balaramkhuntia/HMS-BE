package com.hms.controller;

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.request.DoctorReq;
//import com.hms.mapper.HMSMapper;
//import com.hms.model.Address;
//import com.hms.model.ContactDetails;
//import com.hms.model.DiseaseSpecialization;
//import com.hms.model.Doctor;
//import com.hms.model.WorkExperience;
//import com.hms.request.AddressReq;
//import com.hms.request.ContactDetailsReq;
//import com.hms.request.DoctorReq;
//import com.hms.request.WorkExperienceReq;
import com.hms.service.IDoctorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/hms")
public class HospitalController {

	@Autowired
	private IDoctorService doctorService;

//	@PostMapping("/register/doctor")
//	private void registerDoctor(@Valid @RequestBody DoctorReq doctorReq) {
//		Doctor doctor = new Doctor();
//		doctor.setDoctorName(doctorReq.getDoctorName());
//		doctor.setDob(doctorReq.getDob());
//
//		Set<Address> doctorAddresses = new HashSet<Address>();
//		doctorReq.getAddress().stream().forEach(addressReq -> {
//			Address doctorAddress = new Address();
//			doctorAddress = HMSMapper.mapToAddress(addressReq, doctorAddress);
//
//			doctorAddresses.add(doctorAddress);
//		});
//
//		doctor.setAddresses(doctorAddresses);
//
//		Set<ContactDetails> contactDetails = new HashSet<ContactDetails>();
//		doctorReq.getContactDetailsReqs().stream().forEach(contactDetailsReq -> {
//			ContactDetails doctorContactDetails = new ContactDetails();
//			doctorContactDetails = HMSMapper.mapToContactDetails(contactDetailsReq, doctorContactDetails);
//
//			contactDetails.add(doctorContactDetails);
//		});
//
//		doctor.setContactDetails(contactDetails);
//
//		Set<WorkExperience> experiences = new HashSet<WorkExperience>();
//
//		doctorReq.getExperienceReqs().stream().forEach(experienceReq -> {
//			WorkExperience workExperience = new WorkExperience();
//			workExperience = HMSMapper.mapToWorkExperience(experienceReq, workExperience);
//
//			experiences.add(workExperience);
//		});
//
//		doctor.setExperiences(experiences);
//
//		DiseaseSpecialization diseaseSpecialization = new DiseaseSpecialization();
//		diseaseSpecialization.setSpecializationName(doctorReq.getSpecializationName());
//
//		doctor.setDiseaseSpecialization(diseaseSpecialization);
//
////		doctor.setContactDetails(doctorContactDetails);
////		
////		WorkExperience experience = new WorkExperience();
////		experience.setCompanyName(doct)
//
//		doctorService.registerDoctor(doctor);
//	}
	
	@PostMapping("/register/doctor")

	public ResponseEntity<String> registerDoctor(@Valid @RequestBody DoctorReq doctorReq){
		
		doctorService.registerDoctor(doctorReq);
		
		return new ResponseEntity<>("Doctor saved successfully",HttpStatus.CREATED);
	}
	

}
