package com.example.companydbapi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
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
	
	//private ArrayList<String> skills;
	
	// a default constructor is required from JPA
	public Employee() {
	}
	
	public Employee(String firstName, String lastName, Date dateOfBirth,
			String jobTitle, Date hireDate, int yearsOfExperience, 
		float annualSalaryGross, float annualSalaryNet) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.jobTitle = jobTitle;
		this.hireDate = hireDate;
		this.yearsOfExperience = yearsOfExperience;
		this.annualSalaryGross = annualSalaryGross;
		this.annualSalaryNet = annualSalaryNet;
		//this.skills = new ArrayList<String>();
	}
	
	public Long getId() {
		return id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public void setYearsOfExperience(Integer yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public Integer getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	public void setAnnualSalaryGross(Float annualSalaryGross) {
		this.annualSalaryGross = annualSalaryGross;
	}
	
	public Float getAnnualSalaryGross() {
		return annualSalaryGross;
	}
	
	public void setAnnualSalaryNet(Float annualSalaryNet) {
		this.annualSalaryNet = annualSalaryNet;
	}
	
	public Float getAnnualSalaryNet() {
		return annualSalaryNet;
	}
	
	public void setBuilding(String building) {
		this.building = building;
	}
	
	public String getBuilding() {
		return building;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public String getOffice() {
		return office;
	}
	
//	public void addSkill(String skill) {
//		skills.add(skill);
//	}
}