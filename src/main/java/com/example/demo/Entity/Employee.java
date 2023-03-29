package com.example.demo.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Document("Employee")
@Table
public class Employee {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employyeName;
	private String employeeAge;
	private String employeeEmail;
	private double employeeSal;
	private int employeePhone;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployyeName() {
		return employyeName;
	}
	public void setEmployyeName(String employyeName) {
		this.employyeName = employyeName;
	}
	public String getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(String employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public double getEmployeeSal() {
		return employeeSal;
	}
	public void setEmployeeSal(double employeeSal) {
		this.employeeSal = employeeSal;
	}
	public int getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(int employeePhone) {
		this.employeePhone = employeePhone;
	}
	public Employee(int employeeId, String employyeName, String employeeAge, String employeeEmail, double employeeSal,
			int employeePhone) {
		super();
		this.employeeId = employeeId;
		this.employyeName = employyeName;
		this.employeeAge = employeeAge;
		this.employeeEmail = employeeEmail;
		this.employeeSal = employeeSal;
		this.employeePhone = employeePhone;
	}
	public Employee() {

	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employyeName=" + employyeName + ", employeeAge=" + employeeAge
				+ ", employeeEmail=" + employeeEmail + ", employeeSal=" + employeeSal + ", employeePhone="
				+ employeePhone + "]";
	}



}
