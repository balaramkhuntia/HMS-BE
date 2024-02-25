package com.hms.service;

import org.springframework.http.ResponseEntity;

import com.hms.model.Admin;

public interface IAdminService {

	 ResponseEntity<String> registerAdmin(Admin admin);
}
