package com.hms.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hms.model.Role;
import com.hms.repository.RoleRepo;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HMSRunner implements CommandLineRunner {
	@Autowired
	private RoleRepo roleRepo;

	@Override
	public void run(String... args) throws Exception {
		Role admin = new Role();
		admin.setName("ROLE_ADMIN");

		Role cust = new Role();
		cust.setName("ROLE_PATIENT");

		Role pharmacist = new Role();
		cust.setName("ROLE_PHARMACIST");

		Role adminRole = roleRepo.findByName(admin.getName());
		if (adminRole == null) {
			Role savedRoleAdmin = roleRepo.save(admin);
			if (savedRoleAdmin != null && savedRoleAdmin.getId() != null) {
				log.info("Admin Role Created Successfully");
			}
		}
		Role custRole = roleRepo.findByName(cust.getName());
		if (custRole == null) {
			Role savedRoleCust = roleRepo.save(cust);
			if (savedRoleCust != null && savedRoleCust.getId() != null) {
				log.info("Customer Role Created Successfully");
			}
		}
		Role pharmacistRole = roleRepo.findByName(pharmacist.getName());
		if (pharmacistRole == null) {
			Role pharmacistRoleCust = roleRepo.save(pharmacist);
			if (pharmacistRoleCust != null && pharmacistRoleCust.getId() != null) {
				log.info("Pharmacist Role Created Successfully");
			}
		}
	}

}
