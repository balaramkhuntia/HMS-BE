package com.hms.request;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DoctorReq {
	@Length(min = 5, max = 30, message = "Doctor Name Must Be Minimum of 5 charachters and Maximum of 30 charachters")
	@NotNull
	private String doctorName;

//	specialization details
	private DiseaseSpecializationReq specialization;

	@Valid
	private Set<AddressReq> address;

	@Valid
	private Set<WorkExperienceReq> experienceReqs;

//	Date Of Birth
	private LocalDateTime dob;

//	Contact Details
	@Valid
	private Set<ContactDetailsReq> contactDetailsReqs;

}
