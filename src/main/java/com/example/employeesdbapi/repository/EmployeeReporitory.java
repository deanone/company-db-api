package com.example.employeesdbapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeesdbapi.model.Employee;

public interface EmployeeReporitory extends JpaRepository<Employee, Integer> {
}