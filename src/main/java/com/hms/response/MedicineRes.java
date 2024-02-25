package com.hms.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicineRes {

	private Integer id;

	private String mediceName;

	private String manufacturer;

	private double price;

}
