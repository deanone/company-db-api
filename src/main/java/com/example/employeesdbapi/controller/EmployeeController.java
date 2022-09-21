package com.example.employeesdbapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.employeesdbapi.model.Employee;
import com.example.employeesdbapi.repository.EmployeeReporitory;

public class EmployeeController {

	@Autowired
	private EmployeeReporitory employeeRepository;
	
	@GetMapping("/employees")
	public Iterable<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable(value = "id") Integer id) {
		return employeeRepository.findById(id);
	}
}
