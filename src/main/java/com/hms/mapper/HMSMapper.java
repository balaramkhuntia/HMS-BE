package com.hms.mapper;

import com.hms.model.Address;
import com.hms.model.ContactDetails;
import com.hms.model.WorkExperience;
import com.hms.request.AddressReq;
import com.hms.request.ContactDetailsReq;
import com.hms.request.WorkExperienceReq;

public class HMSMapper {
	public static Address mapToAddress(AddressReq addressReq, Address address) {
		address.setStreet(addressReq.getStreet());
		address.setCity(addressReq.getCity());
		address.setState(addressReq.getCity());
		address.setPinCode(addressReq.getPinCode());
		address.setCountry(addressReq.getCountry());

		return address;
	}

	public static ContactDetails mapToContactDetails(ContactDetailsReq contactDetailsReq,
			ContactDetails contactDetails) {
		contactDetails.setEmail(contactDetailsReq.getEmail());
		contactDetails.setMobileNo(contactDetailsReq.getMobileNo());

		return contactDetails;
	}

	public static WorkExperience mapToWorkExperience(WorkExperienceReq workExperienceReq,
			WorkExperience workExperience) {
		workExperience.setCompanyName(workExperienceReq.getCompanyName());
		workExperience.setExperienceDetails(workExperienceReq.getExperienceDetails());
		workExperience.setFromDate(workExperienceReq.getFromDate());
		workExperience.setToDate(workExperienceReq.getToDate());

		return workExperience;
	}

//	public static AddressReq mapToAddressReq(Address address, AddressReq addressReq) {
//		addressReq.setStreet(address.getStreet());
//		addressReq.setCity(address.getCity());
//		addressReq.setState(address.getCity());
//		addressReq.setPinCode(address.getPinCode());
//		addressReq.setCountry(address.getCountry());
//
//		return addressReq;
//	}
}
