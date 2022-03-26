package com.project2.repository;



import org.springframework.data.repository.CrudRepository;

import com.project2.model.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

	

}
