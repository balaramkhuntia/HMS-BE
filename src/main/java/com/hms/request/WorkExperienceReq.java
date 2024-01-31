package com.hms.request;

import java.time.LocalDateTime;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class WorkExperienceReq {
	@Length(max = 50)
	@NotNull
	private String companyName;

	private LocalDateTime fromDate;

	private LocalDateTime toDate;

	@Length(max = 500)
	@NotNull
	private String experienceDetails;
}
