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

import com.project2.model.Doctor;
import com.project2.service.DoctorService;

@RestController
@RequestMapping("doctor")
@CrossOrigin(origins = "http://localhost:4200")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;

	@GetMapping
	public ResponseEntity<List<Doctor>> getDoctors() { // LOCALHOST:5050/Doctor -GET
		ResponseEntity<List<Doctor>> responseEntity = null;
		List<Doctor> result = null;
		if (doctorService.getDoctors().equals(null)) {
			result = doctorService.getDoctors();
			responseEntity = new ResponseEntity<List<Doctor>>(result, HttpStatus.NO_CONTENT);
		} else {
			result = doctorService.getDoctors();
			responseEntity = new ResponseEntity<List<Doctor>>(result, HttpStatus.OK);
		}
		return responseEntity;
	}

	@GetMapping("{doctorId}")
	public ResponseEntity<Doctor> getDoctor(@PathVariable("doctorId") int doctorId){ // localhost:5050/Doctor/single		
		ResponseEntity<Doctor> responseEntity = null;
		Doctor doctor = new Doctor();
		if (doctorService.doesDoctorExists(doctorId)) {
			doctor = doctorService.getDoctor(doctorId);
			responseEntity = new ResponseEntity<Doctor>(doctor, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<Doctor>(doctor, HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	
	}
	/*
	 //ONLY NEEDED IF WE ADD A PLACE TO ADD/UPDATE/DELETE DOCTORS ON WEBSITE
	@PostMapping
	public ResponseEntity<String> addDoctor(@RequestBody Doctor Doctor) { // localhost:5050/Doctor -POST

		ResponseEntity<String> responseEntity = null;
		String result = null;
		if (DoctorService.doesDoctorExists(Doctor.getDoctorId())) {
			result = "Doctor with Doctor id :" + Doctor.getDoctorId() + " already exists";
			responseEntity = new ResponseEntity<String>(result, HttpStatus.OK); // 200
		} else {
			result = DoctorService.addDoctor(Doctor);
			responseEntity = new ResponseEntity<String>(result, HttpStatus.CREATED);// 201
		}
		return responseEntity;
	}
		
	@PutMapping("{DoctorId}")
	public ResponseEntity<String> updateDoctor(@PathVariable("DoctorId") int DoctorId,
			@RequestBody Doctor Doctor) { /// localhost:5050/Doctor -Put
		ResponseEntity<String> responseEntity = null;
		String result = null;
		if (DoctorService.doesDoctorExists(Doctor.getDoctorId())) {
			result = DoctorService.updateDoctor(DoctorId, Doctor);
			responseEntity = new ResponseEntity<String>(result, HttpStatus.OK);
		} else {
			result = "Doctor with Doctor is :" + Doctor.getDoctorId() + "does not exists";
			responseEntity = new ResponseEntity<String>(result, HttpStatus.NOT_MODIFIED);
		}
		return responseEntity;
	}
	
	@DeleteMapping("{DoctorId}")
	public ResponseEntity<String> deleteByDoctorId(@PathVariable("DoctorId")int doctorId) {
		ResponseEntity<String> responseEntity = null;
		String result = null;
		if (DoctorService.doesDoctorExists(doctorId)) {
			result = DoctorService.deleteDoctor(doctorId);
			responseEntity = new ResponseEntity<String>(result,HttpStatus.OK);
		} else {
			result = "Doctor (id:"+doctorId+") does not exist";
			responseEntity = new ResponseEntity<String>(result,HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}
	*/



