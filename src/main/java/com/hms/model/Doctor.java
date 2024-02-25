package com.hms.model;

import java.util.List;
import java.util.Set;


import jakarta.persistence.Column;
import jakarta.persistence.*;
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
@Getter
@Setter
@ToString
@Table(name = "doctor_details")
public class Doctor extends UserBase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doctor_id")
	private Integer doctorId;

	@OneToOne
	@JoinColumn(name = "doctor_disease_id", nullable = false)
	private Disease disease;

//	@OneToMany
//	@Column(name = "patient_id")
//	private Patient patient;

	@OneToMany(/*cascade = CascadeType.ALL,*/ mappedBy = "doctor")
	private List<Appointment> appointment;

	@OneToMany
	@Column(name = "work_experience_id")
	private Set<WorkExperience> experiences;

	
}