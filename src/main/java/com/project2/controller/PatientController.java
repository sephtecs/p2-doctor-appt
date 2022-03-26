package com.project2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project2.model.Patient;
import com.project2.repository.PatientsRepository;
import com.project2.service.PatientService;

@RestController
@RequestMapping("patient")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

	@Autowired
	PatientService patientService;

	@GetMapping
	public ResponseEntity<List<Patient>> getPatients() { // LOCALHOST:5050/Patient -GET
		ResponseEntity<List<Patient>> responseEntity = null;
		List<Patient> result = null;
		if (patientService.getPatients().equals(null)) {
			result = patientService.getPatients();
			responseEntity = new ResponseEntity<List<Patient>>(result, HttpStatus.NO_CONTENT);
		} else {
			result = patientService.getPatients();
			responseEntity = new ResponseEntity<List<Patient>>(result, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("{patientId}")
	public ResponseEntity<Patient> getPatient(@PathVariable("patientId") int patientId) // localhost:5050/patient/single
																						// -GET
	{
		ResponseEntity<Patient> responseEntity = null;
		Patient patient = new Patient();
		if (patientService.doesPatientExists(patientId)) {
			patient = patientService.getPatient(patientId);
			responseEntity = new ResponseEntity<Patient>(patient, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<Patient>(patient, HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	@PostMapping
	public ResponseEntity<String> addPatient(@RequestBody Patient patient) { // localhost:5050/patient -POST

		ResponseEntity<String> responseEntity = null;
		String result = null;
		if (patientService.doesPatientExists(patient.getPatientId())) {
			result = "patient with patient id :" + patient.getPatientId() + " already exists";
			responseEntity = new ResponseEntity<String>(result, HttpStatus.OK); // 200
		} else {
			result = patientService.addPatient(patient);
			responseEntity = new ResponseEntity<String>(result, HttpStatus.CREATED);// 201
		}
		return responseEntity;
	}

	@PutMapping("{patientId}")
	public ResponseEntity<String> updatepatient(@PathVariable("patientId") int patientId,
			@RequestBody Patient patient) { /// localhost:5050/patient -Put
		ResponseEntity<String> responseEntity = null;
		String result = null;
		if (patientService.doesPatientExists(patient.getPatientId())) {
			result = patientService.updatePatient(patientId, patient);
			responseEntity = new ResponseEntity<String>(result, HttpStatus.OK);
		} else {
			result = "patient with patient is :" + patient.getPatientId() + "does not exists";
			responseEntity = new ResponseEntity<String>(result, HttpStatus.NOT_MODIFIED);
		}
		return responseEntity;
	}
	
	@DeleteMapping("{patientId}")
	public ResponseEntity<String> deleteBypatientId(@PathVariable("patientId")int patientId) {
		ResponseEntity<String> responseEntity = null;
		String result = null;
		if (patientService.doesPatientExists(patientId)) {
			result = patientService.deletePatient(patientId);
			responseEntity = new ResponseEntity<String>(result,HttpStatus.OK);
		} else {
			result = "patient (id:"+patientId+") does not exist";
			responseEntity = new ResponseEntity<String>(result,HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

}
