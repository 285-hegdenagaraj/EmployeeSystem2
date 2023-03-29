package com.example.demo.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Document("Employer")
@Table
public class Employer {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int EmployerId;
	private String EmployerName;
	public int getEmployerId() {
		return EmployerId;
	}
	public void setEmployerId(int employerId) {
		EmployerId = employerId;
	}
	public String getEmployerName() {
		return EmployerName;
	}
	public void setEmployerName(String employerName) {
		EmployerName = employerName;
	}
	public Employer(int employerId, String employerName) {
		super();
		EmployerId = employerId;
		EmployerName = employerName;
	}
	public Employer() {
		
	}
	@Override
	public String toString() {
		return "Employer [EmployerId=" + EmployerId + ", EmployerName=" + EmployerName + "]";
	}

}
