package com.hms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class DiseaseSpecialization {
	@Id
	private Integer specializationId;

	private String specializationName;
}
