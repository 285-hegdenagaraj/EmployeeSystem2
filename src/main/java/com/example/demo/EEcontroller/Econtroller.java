package com.example.demo.EEcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.Employee;
import com.example.demo.Entity.Employer;
import com.example.demo.Service.Eservice;
import com.example.demo.repo.Employeerepo;

@RestController
public class Econtroller {
	@Autowired
	private Employeerepo empRepo;
	@Autowired 
	private Eservice aService;
	
	
	@GetMapping("/HOME")
	public String home() {
		return "home";
	}
	
	@GetMapping("/showEmployer")
	public List<Employee> showEmployerRegister() {
		return aService.getAll();
	}
	
	@PostMapping("/saveEmployer")
	public String saveEmployer(@RequestBody Employer employer) {
		return "Employer saved Successfully";
	}
	
	
	// methods for customer
	@PostMapping("/saveEmployee")
	public ModelAndView saveCustomer(@ModelAttribute Employee employee) {
		ModelAndView mav = new ModelAndView("EmployeeList");
		mav.addObject("custinfo", empRepo.findAll());
		return mav;
	}
	
	@GetMapping("/addEmployee")
	public String showEmployeeRegistration() {
		return "EmployeeRegister";
	}
//	@PutMapping("/updateCustomer")
//	public String updateCustomerDetails(@RequestBody CustomerEntity customerEntity) {
//		String msg = aService.updateCustomer(customerEntity.getCustomerId(), customerEntity);
//		return msg;
//	}
	@GetMapping("/deleteCustomer")
		public ModelAndView deleteEmployee(@ModelAttribute Employee employee) {
		String msg = aService.deleteEmployee(employee.getEmployeeId());
		ModelAndView mav = new ModelAndView("CustomerList");
		mav.addObject("custinfo", empRepo.findAll());
		return mav;
	}
	 @GetMapping("/list")
		public ModelAndView getAllEmployees() {
			ModelAndView mav = new ModelAndView("EmployeeList");
			mav.addObject("empinfo", empRepo.findAll());
			return mav;
		}


}


