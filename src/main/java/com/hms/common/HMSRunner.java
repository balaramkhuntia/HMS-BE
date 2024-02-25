package com.hms.common;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

		Role patient = new Role();
		patient.setName("ROLE_PATIENT");

		Role pharmacist = new Role();
		patient.setName("ROLE_PHARMACIST");
		
		Role doctor = new Role();
		doctor.setName("ROLE_DOCTOR");
		
		Role doctorRole = roleRepo.findByName(doctor.getName());
		if (doctorRole ==null) {
			Role savedRoleDoctor = roleRepo.save(doctor);
			if (savedRoleDoctor!= null && savedRoleDoctor.getId()!=null) {
				log.info("Doctor Role Created Successfully");
			}
			
			
		}
		

		Role adminRole = roleRepo.findByName(admin.getName());
		if (adminRole == null) {
			Role savedRoleAdmin = roleRepo.save(admin);
			if (savedRoleAdmin != null && savedRoleAdmin.getId() != null) {
				log.info("Admin Role Created Successfully");
			}
		}
		Role patientRole = roleRepo.findByName(patient.getName());
		if (patientRole == null) {
			Role savedRolepatient = roleRepo.save(patient);
			if (savedRolepatient != null && savedRolepatient.getId() != null) {
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
