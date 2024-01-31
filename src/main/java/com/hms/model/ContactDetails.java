package com.hms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "contact_details")
// uniqueConstraints = @UniqueConstraint(columnNames = { "mobile_no", "email_id" })
public class ContactDetails {
	@Id
	@Column(name = "contact_details_id")
	private Integer contactDetailsId;

	@Column(name = "mobile_no", nullable = false, unique = true)
	private Long mobileNo;

	@Column(name = "email_id", nullable = false, unique = true)
	private String email;
}