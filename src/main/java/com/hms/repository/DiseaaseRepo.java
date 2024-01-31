package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.model.DiseaseSpecialization;

@Repository
public interface DiseaaseRepo extends JpaRepository<DiseaseSpecialization, Integer> {

}
