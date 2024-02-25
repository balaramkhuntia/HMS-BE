package com.hms.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Doctor extends UserBase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doctor_id")
	private Integer doctorId;

	@OneToOne
	@Column(name = "doctor_disease_specialization_id", nullable = false)
	private DiseaseSpecialization diseaseSpecialization;

//	@OneToMany
//	@Column(name = "patient_id")
//	private Patient patient;

	@OneToMany(/*cascade = CascadeType.ALL,*/ mappedBy = "doctor")
	private Appointment appointment;

	@OneToMany
	@Column(name = "work_experience_id")
	private Set<WorkExperience> experiences;

	@OneToMany
	@Column(name = "contact_details_id")
	private Set<ContactDetails> contactDetails;
}