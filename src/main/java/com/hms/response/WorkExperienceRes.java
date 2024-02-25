package com.hms.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkExperienceRes {

	private Integer workExperienceId;

	private String companyName;
	
	private LocalDateTime fromDate;

	private LocalDateTime toDate;

	private String experienceDetails;

}
