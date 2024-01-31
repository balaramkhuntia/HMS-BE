package com.hms.request;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DiseaseSpecializationReq {
	@Length(min = 5, max = 20)
	@NotNull
	private String specializationName;
}
