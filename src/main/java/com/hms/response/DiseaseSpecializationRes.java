package com.hms.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DiseaseSpecializationRes {
	
	private Integer specializationId;

	private String specializationName;
	
	private AppointmentRes appointmentRes;

}
