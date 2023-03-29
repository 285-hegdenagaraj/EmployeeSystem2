package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Employer;
import com.example.demo.repo.Employeerepo;
import com.example.demo.repo.Employerrepo;

@Service
	public class Eservice implements IService{
		@Autowired
		private Employerrepo empRepo;
		@Autowired
		private Employeerepo employeeRepo;
		
		@Override
		public String saveEmployer(Employer  employer) {
			empRepo.save(employer);
			return "Employer is saved successfully";
		}
		
		// Methods for Employee
		@Override
		public String saveEmployee (Employee employee) {
			employeeRepo.save(employee);
			return "Employee saved successfully";
		}

		@Override
		public String updateEmployee (int employeeId, Employee employee) {
			boolean flag = employeeRepo.existsById(employeeId);
			if(flag) {
				employeeRepo.save(employee);
				return "Employee is updated successfully";
			}
			else {
			return "Problem in finding Employee";
			}
		}

		@Override
		public String deleteEmployee(int employeeId) {
			boolean flag = employeeRepo.existsById(employeeId);
			if(flag) {
				employeeRepo.deleteById(employeeId);
				return "Employee deleted successfully";
			}
			else {
			return "Problem in finding Employee";
			}
		}

		
		public List<Employee> getAll() {
			List<Employee> list=(List<Employee>)
					employeeRepo.findAll();
			return list;
			
		}

		@Override
		public String getEmployee(int employeeId) {
			// TODO Auto-generated method stub
			return null;
		}
		

	}



