package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.model.Pharmasist;

@Repository
public interface PharmasistRepo extends JpaRepository<Pharmasist, Integer> {

}
