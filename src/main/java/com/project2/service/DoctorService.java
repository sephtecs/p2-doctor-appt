package com.project2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project2.model.Doctor;


public interface DoctorService {
	//Only use if we add a place to insert doctors on web browser
	public String addDoctor (Doctor doctor);
	public String updateDoctor (int doctorId, Doctor doctor);
	//public String deleteDoctor(int doctorId);
	public List<Doctor> getDoctors();
	public boolean doesDoctorExists(int doctorId);
	public boolean doesSpecialtyExist(String specialty);
	public boolean doesLocation_City(String location_city);
	public boolean doesLocation_state(String location_state);
	public boolean doesInsuranceExceptedExist(String insurance_Excepted);
	public Doctor getDoctor(int doctorId);
	public List<Doctor> getDoctorByName(String doctortName);
	//public List<Doctor> get (String location);
	//public boolean docLiveLocaiton(String location, int doctorId);
	//public boolean isInsuranceExcepted (String insuranceExcepted, int doctorId);
	public Optional<List<Doctor>> getDoctorBySLI(String specialty, String location_city, String location_state, String insurance_Excepted);
	//List<Doctor>findBySpecialtyLocation_CityLocation_StateInsurance_Excepted(String specialty, String location_city, String location_state, String insurance_Excepted);
	
}  
