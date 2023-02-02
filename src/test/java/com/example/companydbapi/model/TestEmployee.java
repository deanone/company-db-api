package com.example.companydbapi.model;

import java.util.Date;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;  

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
	
	Employee employee;
	
	@BeforeEach
	void setup() throws Exception {
		String firstName = "Foo";
		String lastName = "Footer";
		Date dateOfBirth;
		dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000");
		String jobTitle = "Software Engineer";
		Date hireDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2021");
		int yearsOfExperience = 2;
		float annualSalaryGross = 10000.0f;
		float annualSalaryNet = 7000.0f;
		
		employee = new Employee(firstName, lastName, dateOfBirth, jobTitle, 
                hireDate, yearsOfExperience, 
                annualSalaryGross, annualSalaryNet);
	}

	@Test
	void persist_after_generation_test() {
		
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1);
		
		assertEquals("Foo", fetchedEmployee.getFirstName());
		
	}
}
