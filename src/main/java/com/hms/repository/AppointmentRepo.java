package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.model.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
