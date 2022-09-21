package com.example.employeesdbapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.employeesdbapi.model.Employee;

public interface EmployeeReporitory extends CrudRepository<Employee, Integer> {
}