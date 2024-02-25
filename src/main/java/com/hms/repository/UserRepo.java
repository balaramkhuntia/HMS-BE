package com.hms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.model.User;



public interface UserRepo extends JpaRepository<User, Integer>{
	
	
	Optional<User> findByEmail(String email);
	
	Optional<User> findByUsername(String username);
	
	Optional<User> findByEmailOrUsername(String email,String username);
	
	
	Boolean existByEmail(String email);
	
	Boolean existByUsername(String username);
	


}
