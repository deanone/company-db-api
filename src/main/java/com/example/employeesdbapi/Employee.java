package com.example.employeesdbapi;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	
	@Column(name = "jobTitle")
	private String jobTitle;
	
	@Column(name = "hireDate")
	private Date hireDate;
	
	@Column(name = "yearsOfExperience")
	private int yearsOfExperience;
	
	@Column(name = "annualSalaryGross")
	private float annualSalaryGross;
	
	@Column(name = "annualSalaryNet")
	private float annualSalaryNet;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, Date dateOfBirth, String jobTitle, Date hireDate, int yearsOfExperience, 
			float annualSalaryGross, float annualSalaryNet) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.jobTitle = jobTitle;
		this.hireDate = hireDate;
		this.yearsOfExperience = yearsOfExperience;
		this.annualSalaryGross = annualSalaryGross;
		this.annualSalaryNet = annualSalaryNet;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
}
