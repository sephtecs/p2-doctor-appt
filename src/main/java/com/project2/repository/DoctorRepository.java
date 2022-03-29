package com.project2.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project2.model.Doctor;


public interface DoctorRepository extends CrudRepository<Doctor, Integer> {

	/*
	List<Doctor>findByLocationId(String location);

	
	List<Doctor> findByDoctorSLI(String specialty, String location, String insuranceExpected);
	/*
	
	@Query("From Doctors d WHERE d.specialty LIKE :specialty and d.location LIKE :location and d.insuranceExpected LIKE :insuranceExpected")
	public Optional<List<Doctor>> findByMyDoctorSLIOptional(@Param("specialty") String specialty,
			@Param("location") String location, @Param ("insuranceExpected") String insuranceExpected);
	
	
	*/

	

}
