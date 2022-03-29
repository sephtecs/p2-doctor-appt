package com.project2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "doctors")
public class Doctor {
	
	@Id
	private int doctorId;
	private String doctorName;
	private String specialty;
	private String location_city;
	private String location_state;
	private String insuranceExcepted;
}
