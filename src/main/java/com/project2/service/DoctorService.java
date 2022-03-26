package com.project2.service;

import java.util.List;

import com.project2.model.Doctor;

public interface DoctorService {
	//Only use if we add a place to insert doctors on web browser
	//public String addDoctor (Doctor doctor);
	//public String updateDoctor (int doctorId, Doctor doctor);
	//public String deleteDoctor(int doctorId);
	public List<Doctor> getDoctors();
	public boolean doesDoctorExists(int doctorId);
	public Doctor getDoctor(int doctorId);
	//public Doctor getDoctorLocation (String location, int doctorId);
	public boolean docLiveLocaiton(String location, int doctorId);
	public boolean isInsuranceExcepted (String insuranceExcepted, int doctorId);
}
