	package com.hms.model;
	
	import jakarta.persistence.CascadeType;
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.OneToOne;
	import lombok.Getter;
	import lombok.Setter;
	import lombok.ToString;
	
	@Entity
	@Setter
	@Getter
	@ToString
	public class Address {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "address_id")
		private Integer addressId;
	
		@Column(name = "street")
		private String street;
	
		@Column(name = "city")
		private String city;
	
		@Column(name = "state")
		private String state;
	
		@Column(name = "country")
		private String country;
	
		@Column(name = "pinCode")
		private Integer pinCode;
		
		@OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
		private Admin admin;
	}
