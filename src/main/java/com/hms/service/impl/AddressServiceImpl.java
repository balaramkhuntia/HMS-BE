package com.hms.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.model.Address;
import com.hms.repository.AddressRepo;
import com.hms.request.AddressReq;
import com.hms.response.AddressRes;
import com.hms.service.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepo addressRepo;

	@Override
	public AddressRes saveAddress(AddressReq addressReq) {

		Address address = new Address();
		BeanUtils.copyProperties(addressReq, address);
		Address savedAddress = addressRepo.save(address);
        AddressRes savedAddressRes = new AddressRes();
        BeanUtils.copyProperties(savedAddress, savedAddressRes);

		return savedAddressRes;
	}

	@Override
	public AddressRes updateAddress(Integer addressId, AddressReq addressReq) {

		Address existingAddress = addressRepo.findById(addressId).orElseThrow(()-> new RuntimeException("Address not Found"));
		
		BeanUtils.copyProperties(addressReq, existingAddress);
		Address updatedAddress = addressRepo.save(existingAddress);
		AddressRes updatedAddressRes = new AddressRes();
		BeanUtils.copyProperties(updatedAddress, updatedAddressRes);
		
		return updatedAddressRes;
	}

  

}
