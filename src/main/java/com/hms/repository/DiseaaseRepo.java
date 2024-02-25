package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.hms.model.Disease;

@Repository
public interface DiseaaseRepo extends JpaRepository<Disease, Integer> {

}
