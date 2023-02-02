package com.example.companydbapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	private Integer yearsOfExperience;
	
	@Column(name = "annualSalaryGross")
	private Float annualSalaryGross;
	
	@Column(name = "annualSalaryNet")
	private Float annualSalaryNet;
	
	@Column(name = "building")
	private String building;
	
	@Column(name = "office")
	private String office;
	
	private ArrayList<String> skills;
	
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
		this.skills = new ArrayList<String>();
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
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public String getDateOfBirthString() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(dateOfBirth);
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public String getHireDateString() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(hireDate);
	}
	
	public Integer getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	public Float getAnnualSalaryGross() {
		return annualSalaryGross;
	}
	
	public Float getAnnualSalaryNet() {
		return annualSalaryNet;
	}
	
	public String getBuilding() {
		return building;
	}
	
	public String getOffice() {
		return office;
	}
	
	public void addSkill(String skill) {
		skills.add(skill);
	}
}