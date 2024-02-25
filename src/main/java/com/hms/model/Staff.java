package com.hms.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Staff extends UserBase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staff_id")
	private Long staffId;

	@Column(name = "staff_name")
	private String staffName;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

}
