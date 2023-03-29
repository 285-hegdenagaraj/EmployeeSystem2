package com.example.demo.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Employer;

public interface IService {
	public String saveEmployee(Employee employee);
	public String updateEmployee(int employeeId, Employee employee);
	public String deleteEmployee(int employeeId);
	String saveEmployer(Employer employer);
	public String getEmployee(int employeeId);

}
