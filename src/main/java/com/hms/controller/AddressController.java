package com.hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.request.AddressReq;
import com.hms.response.AddressRes;
import com.hms.service.IAddressService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/address")
public class AddressController {

	
	 @Autowired
	    private IAddressService addressService;

	    @PostMapping("/save")
	    public ResponseEntity<AddressRes> saveAddress(@Valid @RequestBody AddressReq addressReq) {
	        AddressRes savedAddress = addressService.saveAddress(addressReq);
	        return new ResponseEntity<>(savedAddress, HttpStatus.CREATED);
	    }
	    
	    
	    @PutMapping("/update/{addressId}")
	    public ResponseEntity<AddressRes> updateAddress(@PathVariable ("addressId")Integer addressId,@RequestBody AddressReq addressReq ){
	    
	    AddressRes updateAddressRes = addressService.updateAddress(addressId, addressReq);
	    	
	    	
	    	
	    	return new ResponseEntity<>(updateAddressRes,HttpStatus.OK);
	    }
}
