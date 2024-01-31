package com.hms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class WorkExperience {
	@Id
	private Integer workExperienceId;

	private String companyName;

	private LocalDateTime fromDate;

	private LocalDateTime toDate;

	private String experienceDetails;
}
