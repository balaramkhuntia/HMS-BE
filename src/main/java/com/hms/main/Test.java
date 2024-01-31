package com.hms.main;

import java.util.HashSet;
import java.util.Set;

import com.hms.request.ContactDetailsReq;

public class Test {

	public static void main(String[] args) {
		ContactDetailsReq contactDetails = new ContactDetailsReq();
		contactDetails.setEmail("sanju@gmail.com");
		contactDetails.setMobileNo(1234567890l);

		ContactDetailsReq contactDetails2 = new ContactDetailsReq();
		contactDetails2.setEmail("sanju@gmail.com");
		contactDetails2.setMobileNo(1234567891l);

		Set<ContactDetailsReq> detailsReqs = new HashSet<>();
		detailsReqs.add(contactDetails);
		detailsReqs.add(contactDetails2);

		for (ContactDetailsReq contactDetailsReq : detailsReqs) {
			System.out.println(contactDetailsReq);
		}
	}
}
