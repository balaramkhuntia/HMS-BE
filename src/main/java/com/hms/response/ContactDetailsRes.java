package com.hms.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDetailsRes {
	
	private Integer contactDetailsId;

	private Long mobileNo;

	private String email;


}
