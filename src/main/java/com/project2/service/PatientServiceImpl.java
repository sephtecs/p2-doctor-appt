package com.project2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.model.Patient;
import com.project2.repository.PatientsRepository;

@Service 
public class PatientServiceImpl implements PatientService {
	@Autowired
	PatientsRepository patientsRepository;
	
	@Override
	public String addPatient(Patient patient) {
		patientsRepository.save(patient);
		return "Patient saved successfully";
	}

	@Override
	public String updatePatient(int patientId, Patient patient) {
		patientsRepository.save(patient);
		return "Patientwas updated successfully";
	}

	@Override
	public String deletePatient(int patientId) {
		patientsRepository.deleteById(patientId);
		return "Product deleted successfully!!";
	}

	@Override
	public List<Patient> getPatients() {
		return (List<Patient>)patientsRepository.findAll();
	}

	@Override
	public boolean doesPatientExists(int patientId) {
		Optional<Patient> patient= patientsRepository.findById(patientId);
		return patient.isPresent();
	}

	@Override
	public Patient getPatient(int patientId) {
		Optional<Patient> patient= patientsRepository.findById(patientId);
		return patient.get();
	}

}
