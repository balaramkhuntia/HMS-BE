package com.hms.request;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ContactDetailsReq {
	@NotNull
	private Long mobileNo;

	@Length(max = 30)
	@NotNull
	@Email
	private String email;
}
