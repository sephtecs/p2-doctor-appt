package com.project2.repository;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project2.model.Doctor;
import com.project2.service.DoctorService;



public interface DoctorRepository extends CrudRepository<Doctor, Integer>{

	//List<Doctor> findBySpecialty(String specialty);
	
	//List<Doctor> findByLocation_City(String location_city);
	
	//List<Doctor> findByLocation_State(String location_state);
	
	//List<Doctor> findByInsurance_Excepted(String insurance_Excepted);
	
	//List<Doctor> findByDoctorName(String doctorName);
	
	
	//List<Doctor> findByDoctorSLI(String specialty, String location, String insuranceExpected);
	
	//List<Doctor>findBySpecialtyLocation_CityLocation_StateInsurance_Excepted(String specialty, String location_city, String location_state, String insurance_Excepted);
	//Optional<List<Doctor>>findByMySpecialtyLocation_CityLocation_StateInsurance_Excepted(String specialty, String location_city, String location_state,String insurance_Excepted);
	
	
	@Query("FROM Doctor d WHERE d.specialty LIKE :spec AND d.location_city LIKE :loccity AND d.location_state LIKE :locstate AND d.insurance_Excepted LIKE :insexec ")
    public Optional<List<Doctor>> findByMySpecialtyLocation_CityLocation_StateInsurance_Excepted(@Param("spec") 
    String specialty, @Param("loccity") String location_city, @Param("locstate") String location_state, @Param("insexec") String insuranceExcepted );
	
	/*
	List<Doctor>findByLocationId(String location);

	
	
	/*
	
	@Query("From Doctors d WHERE d.specialty LIKE :specialty and d.location LIKE :location and d.insuranceExpected LIKE :insuranceExpected")
	public Optional<List<Doctor>> findByMyDoctorSLIOptional(@Param("specialty") String specialty,
			@Param("location") String location, @Param ("insuranceExpected") String insuranceExpected);
	
	
	*/

	

}


//SELECT * FROM Doctors d WHERE d.specialty LIKE 'physician' AND d.location_city LIKE 'Dallas'
//AND d.location_state LIKE 'Texas' AND d.insurance_Excepted = 'Allied'