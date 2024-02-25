package com.hms.response;

import java.time.LocalDateTime;
import java.util.Set;

import com.hms.model.Disease;

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

	private DiseaseRes diseaseRes;

	private Set<AddressRes> addresses;

	private PatientRes patient;

	private AppointmentRes appointment;


	private Set<WorkExperienceRes> experiences;

	
	
}
