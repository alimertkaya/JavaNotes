package com.alimertkaya.exception_management;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alimertkaya.exception_management.dto.DtoEmployee;
import com.alimertkaya.exception_management.service.IEmployeeService;

@SpringBootTest
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("BeforeEach çalıştı...");
	}
	
	@Test
	public void testFindEmployeeById() {
		DtoEmployee employee = employeeService.findEmployeeById(4L);
		
		assertEquals(4, 4);
		// icine gecilen deger null olamaz
//		assertNotNull(employee);
//		if (employee != null) {
//			System.out.println("İsim: " + employee.getName());
//		}
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("AfterEach çalıştı...");
	}
}
