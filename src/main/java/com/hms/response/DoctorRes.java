package com.hms.response;

import java.time.LocalDateTime;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor

public class DoctorRes {
	
	private Integer doctorId;

	
	private String doctorName;

	
	private LocalDateTime dob;

	private DiseaseSpecializationRes diseaseSpecializationRes;

	private Set<AddressRes> addresses;

	private PatientRes patient;

	private AppointmentRes appointment;


	private Set<WorkExperienceRes> experiences;

	
	private Set<ContactDetailsRes> contactDetails;
	
}
