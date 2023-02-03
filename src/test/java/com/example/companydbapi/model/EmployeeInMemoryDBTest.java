package com.example.companydbapi.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import javax.annotation.Resource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import com.example.companydbapi.repository.EmployeeReporitory;

@SpringBootTest
public class EmployeeInMemoryDBTest {
	
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String jobTitle = "Software Engineer";
	private Date hireDate;
	private int yearsOfExperience;
	private float annualSalaryGross;
	private float annualSalaryNet;

	@Autowired
	private EmployeeReporitory employeeRepository;
	
	@BeforeEach
	public void setup() throws Exception {

		firstName = "Foo";
		lastName = "Footer";
		dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000");
		jobTitle = "Software Engineer";
		hireDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2021");
		yearsOfExperience = 2;
		annualSalaryGross = 10000.0f;
		annualSalaryNet = 7000.0f;
	}
	
	@Test
	public void persist_firstName__test() {
		
		Employee employee = employeeRepository
		          .save(new Employee(firstName, lastName, dateOfBirth,
		        		             jobTitle, hireDate, yearsOfExperience, 
                                     annualSalaryGross, annualSalaryNet));
		
		Optional<Employee> fetchedEmployee = employeeRepository.findById(employee.getId());
		
		assertEquals("Foo", fetchedEmployee.get().getFirstName());
	}
}
