package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

	
}
