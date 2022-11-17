package com.example.companydbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.companydbapi.model.Employee;

public interface EmployeeReporitory extends JpaRepository<Employee, Long> {
	
}