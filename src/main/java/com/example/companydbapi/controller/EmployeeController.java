package com.example.companydbapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.companydbapi.model.Employee;
import com.example.companydbapi.repository.EmployeeReporitory;

@RestController
@RequestMapping(path = "/api")
public class EmployeeController {

	@Autowired
	private EmployeeReporitory employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable(value = "id") Long id) {
		return employeeRepository.findById(id);
	}
}
