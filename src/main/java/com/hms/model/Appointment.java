package com.hms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Appointment {
	@Id
	private Integer appointmentId;

	@OneToOne
	private Doctor doctor;

	@OneToOne
	private DiseaseSpecialization diseaseSpecialization;

	@OneToOne
	private Patient patient;

	private LocalDateTime appointmentTime;

	private Double appointmentFee;
}
