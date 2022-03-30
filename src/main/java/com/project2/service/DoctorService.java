package com.project2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project2.model.Doctor;

@Service
public interface DoctorService {
	//Only use if we add a place to insert doctors on web browser
	public String addDoctor (Doctor doctor);
	public String updateDoctor (int doctorId, Doctor doctor);
	//public String deleteDoctor(int doctorId);
	public List<Doctor> getDoctors();
	public boolean doesDoctorExists(int doctorId);
	public Doctor getDoctor(int doctorId);
	//public List<Doctor> getDoctorByLocationId (String location);
	//public boolean docLiveLocaiton(String location, int doctorId);
	//public boolean isInsuranceExcepted (String insuranceExcepted, int doctorId);
	public List<Doctor> getDoctorBySLI(String specialty, String location_city, String location_state, String insurance_Excepted);

	
}  
