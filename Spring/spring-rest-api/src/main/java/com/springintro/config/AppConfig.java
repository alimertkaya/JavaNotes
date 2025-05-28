package com.springintro.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springintro.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean
	public List<Employee> employeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee("1", "Enes", "Bayram"));
		employeeList.add(new Employee("2", "Mert", "Kaya"));
		employeeList.add(new Employee("3", "Yakup", "Reçber"));
		employeeList.add(new Employee("4", "Ege", "Şahin"));
		employeeList.add(new Employee("5", "Bilal", "Çamur"));
		employeeList.add(new Employee("6", "Enes", "Çamur"));

		return employeeList;
	}
}
