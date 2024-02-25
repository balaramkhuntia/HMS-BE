package com.hms.response;

import lombok.Data;

@Data
public class DiseaseRes {
	
	private Integer diseaseId;

	private String diseaseName;
	
	private AppointmentRes appointmentRes;

}
