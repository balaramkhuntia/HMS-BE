package com.hms.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientRes {
	
	private Integer patientId;

	private String patientName;

	private DoctorRes doctorRes;
	
	private AddressRes addressRes;
	
	private DiseaseRes diseaseRes;
	
	private AppointmentRes appointmentRes;
	







}
