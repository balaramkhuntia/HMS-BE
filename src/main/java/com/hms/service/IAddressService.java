package com.hms.service;

import com.hms.model.Address;
import com.hms.request.AddressReq;
import com.hms.response.AddressRes;

public interface IAddressService {
	
	AddressRes saveAddress(AddressReq addressReq);
	
	AddressRes updateAddress(Integer addressId,AddressReq addressReq);
	
	
	

}
