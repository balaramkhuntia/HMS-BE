package com.hms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer patientId;

	private String patientName;

	@OneToMany
	private Doctor doctor;

	@OneToOne
	private Address address;

	@OneToMany
	private DiseaseSpecialization diseaseSpecialization;

	@OneToOne
	private Appointment appointment;

	@OneToOne
	@Column(name = "contact_details_id")
	private ContactDetails contactDetails;
}