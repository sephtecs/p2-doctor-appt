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
@Table (name = "patients")

public class Patient {
	
	@Id
	private int patientId;
	private String patientName;
	private String symptom_reason;
	private String doctorAttended;
	private String appointmentTime;
	private String insuranceProvider;
	

}
