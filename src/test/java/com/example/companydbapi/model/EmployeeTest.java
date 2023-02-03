package com.example.companydbapi.model;

import java.util.Date;
import java.text.SimpleDateFormat; 

import javax.persistence.EntityManager;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	Employee employee;
	
	@BeforeEach
	public void setup() throws Exception {
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
	public void persist_firstName__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1L)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1L);
		
		assertEquals("Foo", fetchedEmployee.getFirstName());
	}
	
	@Test
	public void persist_lastName__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1L)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1L);
		
		assertEquals("Footer", fetchedEmployee.getLastName());
	}
	
	@Test
	public void persist_dateOfBirth__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1L)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1L);
		
		assertEquals("01/01/2000", fetchedEmployee.getDateOfBirthString());
	}
	
	@Test
	public void persist_jobTitle__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1L)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1L);
		
		assertEquals("Software Engineer", fetchedEmployee.getJobTitle());
	}
	
	@Test
	public void persist_hireDate__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1L)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1L);
		
		assertEquals("01/01/2021", fetchedEmployee.getHireDateString());
	}
	
	@Test
	public void persist_yearsOfExperience__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1L)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1L);
		
		assertEquals(2, fetchedEmployee.getYearsOfExperience());
	}
	
	@Test
	public void persist_annualSalaryGross__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1L)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1L);
		
		assertEquals(10000.0f, fetchedEmployee.getAnnualSalaryGross());
	}
	
	@Test
	public void persist_annualSalaryNet__test() {
		EntityManager entityManager = mock(EntityManager.class);
		
		when(entityManager.find(Employee.class, 1L)).thenReturn(employee);
		
		Employee fetchedEmployee = entityManager.find(Employee.class, 1L);
		
		assertEquals(7000.0f, fetchedEmployee.getAnnualSalaryNet());
	}
}
