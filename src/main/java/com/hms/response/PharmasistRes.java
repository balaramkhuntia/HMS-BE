package com.hms.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PharmasistRes {
	
	private Integer pharmasistId;

	private AddressRes addressRes;
	
	private WorkExperienceRes experienceRes;
	




}
