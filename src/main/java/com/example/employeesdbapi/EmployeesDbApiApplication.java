package com.example.employeesdbapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EmployeesDbApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesDbApiApplication.class, args);
	}

}
