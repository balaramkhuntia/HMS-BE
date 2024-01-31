package com.hms.model;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "doctor_details")
public class Doctor {
	@Id
	@Column(name = "doctor_id")
	private Integer doctorId;

	@Column(name = "doctor_name", nullable = false, length = 30)
	private String doctorName;

	@Column(name = "doctor_date_of_birth", nullable = false)
	private LocalDateTime dob;

	@OneToOne
	@Column(name = "doctor_disease_specialization_id", nullable = false)
	private DiseaseSpecialization diseaseSpecialization;

	@OneToMany
	@Column(name = "doctor_address_id", nullable = false)
	private Set<Address> addresses;

	@OneToMany
	@Column(name = "patient_id")
	private Patient patient;

	@OneToMany
	@Column(name = "appointment_id")
	private Appointment appointment;

	@OneToMany
	@Column(name = "work_experience_id")
	private Set<WorkExperience> experiences;

	@OneToMany
	@Column(name = "contact_details_id")
	private Set<ContactDetails> contactDetails;
}