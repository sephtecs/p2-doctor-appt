package com.project2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.model.Doctor;
import com.project2.repository.DoctorRepository;

@Service

public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository doctorRepository;
	
	@Override
	public List<Doctor> getDoctors() {
		return (List<Doctor>)doctorRepository.findAll();
	}

	@Override
	public boolean doesDoctorExists(int doctorId) {
		Optional<Doctor> doctor= doctorRepository.findById(doctorId);
		return doctor.isPresent();
	}

	@Override
	public Doctor getDoctor(int doctorId) {
		Optional<Doctor> doctor= doctorRepository.findById(doctorId);
		return doctor.get();
	}

	////NEEDS WORK ON THIS METHOD STILL NEED TO FIGURE OUT OF A VAILDATION FOR LOACATION/DOCTOR
	@Override
	public boolean docLiveLocaiton(String location, int doctorId) {
		Optional<Doctor> doctor = doctorRepository.findById(doctorId);
		return doctor.isPresent();
	
	}

	////NEEDS WORK ON THIS METHOD STILL NEED TO FIGURE OUT OF A VAILDATION FOR INSURANCE/DOCTOR
	@Override
	public boolean isInsuranceExcepted(String insuranceExcepted, int doctorId) {
		Optional<Doctor> doctor = doctorRepository.findById(doctorId);
		return doctor.isPresent();
	}

	/*
	@Override
	public List<Doctor> getDoctorBySLI(String specialty, String location, String insuranceExpected) {
		return doctorRepository.findByDoctorSLI(specialty, location,  insuranceExpected);
	}
	*/

	@Override
	public String addDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		return "Doctor Saved";
	}
/*
	@Override
	public List<Doctor> getDoctorByLocationId(String location){
		// TODO Auto-generated method stub
		return doctorRepository.findByLocationId(location);
		*/

	@Override
	public String updateDoctor(int doctorId, Doctor doctor) {
		doctorRepository.save(doctor);
		return "Doctor Updated";
	}
	

}
