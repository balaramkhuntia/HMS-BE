package com.hms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Pharmasist {
	@Id
	private Integer pharmasistId;

	@OneToOne
	private Address address;

	@OneToMany
	private WorkExperience experience;

	@OneToOne
	@Column(name = "contact_details_id")
	private ContactDetails contactDetails;
}
