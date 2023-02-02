package com.example.companydbapi.model;

import java.util.Date;
import java.text.SimpleDateFormat; 

import javax.persistence.EntityManager;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee employee;
	
	@BeforeEach
	void setup() throws Exception {
		String firstName = "Foo";
		String lastName = "Footer";
		Date dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2000");
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
	void persist_firstName__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1);
		
		assertEquals("Foo", fetchedEmployee.getFirstName());
	}
	
	@Test
	void persist_lastName__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1);
		
		assertEquals("Footer", fetchedEmployee.getLastName());
	}
	
	@Test
	void persist_dateOfBirth__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1);
		
		assertEquals("01/01/2000", fetchedEmployee.getDateOfBirthString());
	}
	
	@Test
	void persist_jobTitle__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1);
		
		assertEquals("Software Engineer", fetchedEmployee.getJobTitle());
	}
	
	@Test
	void persist_hireDate__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1);
		
		assertEquals("01/01/2021", fetchedEmployee.getHireDateString());
	}
	
	@Test
	void persist_yearsOfExperience__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1);
		
		assertEquals(2, fetchedEmployee.getYearsOfExperience());
	}
	
	@Test
	void persist_annualSalaryGross__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1);
		
		assertEquals(10000.0f, fetchedEmployee.getAnnualSalaryGross());
	}
}
