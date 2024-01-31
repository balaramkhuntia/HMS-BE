package com.hms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Address {
	@Id
//	@SequenceGenerator(name = "addressIdGen", sequenceName = "addressIdgen", allocationSize = 1, initialValue = 100)
//	@GeneratedValue(generator = "addressIdGen", strategy = GenerationType.SEQUENCE)
	private Integer addressId;

	private String street;

	private String city;

	private String state;

	private String country;

	private Integer pinCode;
}
