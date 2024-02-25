package com.hms.request;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressReq {
	
		
	@Length(max = 20)
	@NotNull
	private String street;

	@Length(max = 20)
	@NotNull
	private String city;

	@Length(max = 20)
	@NotNull
	private String state;

	@Length(max = 20)
	@NotNull
	private String country;

	@NotNull
	private Integer pinCode;
}
