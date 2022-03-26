package com.project2.repository;

import org.springframework.data.repository.CrudRepository;

import com.project2.model.Patient;

public interface PatientsRepository extends CrudRepository<Patient, Integer> {

}
