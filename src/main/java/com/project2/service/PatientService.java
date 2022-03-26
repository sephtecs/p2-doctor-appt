package com.project2.service;

import java.util.List;

import com.project2.model.Patient;

public interface PatientService {

	public String addPatient (Patient patient);
	public String updatePatient (int patientId, Patient patient);
	public String deletePatient(int patientId);
	public List<Patient> getPatients();
	public boolean doesPatientExists(int patientId);
	public Patient getPatient (int patientId);
	
	
}
