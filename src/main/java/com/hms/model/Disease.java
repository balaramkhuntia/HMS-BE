package com.hms.model;

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
public class Disease {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "disease_id")
	private Integer diseaseId;

	@Column(name = "disease_name")
	private String diseaseName;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "disease")
	private Appointment appointment;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Doctor doctor;
}