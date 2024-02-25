package com.hms.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentRes {

	private Integer appointmentId;

	private DoctorRes doctorRes;
	
	private DiseaseRes diseaseRes;

	private PatientRes patientRes;
	
	private LocalDateTime appointmentTime;

	private Double appointmentFee;


}
