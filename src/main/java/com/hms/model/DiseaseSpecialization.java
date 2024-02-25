package com.hms.model;

import com.hms.request.DiseaseSpecializationReq;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class DiseaseSpecialization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "specialization_id")
	private Integer specializationId;

	@Column(name = "specialization_name")
	private String specializationName;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "diseaseSpecialization")
	private Appointment appointment;
}