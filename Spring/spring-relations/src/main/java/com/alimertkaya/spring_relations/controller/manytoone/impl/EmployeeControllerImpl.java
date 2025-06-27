package com.alimertkaya.spring_relations.controller.manytoone.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alimertkaya.spring_relations.controller.manytoone.IEmployeeController;
import com.alimertkaya.spring_relations.dto.manytoone.DtoEmployee;
import com.alimertkaya.spring_relations.dto.manytoone.DtoEmployeeIU;
import com.alimertkaya.spring_relations.service.manytoone.IEmployeeService;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@PostMapping("/save")
	@Override
	public DtoEmployee saveEmployee(@RequestBody DtoEmployeeIU dtoEmployeeIU) {
		return employeeService.saveEmployee(dtoEmployeeIU);
	}
	
	@GetMapping("/list/{id}")
	@Override
	public DtoEmployee getEmployeeById(@PathVariable(name = "id") Long id) {
		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/list")
	@Override
	public List<DtoEmployee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@PutMapping("/update/{id}")
	@Override
	public DtoEmployee updateEmployee(@PathVariable(name = "id") Long id, @RequestBody DtoEmployeeIU dtoEmployeeIU) {
		return employeeService.updateEmployee(id, dtoEmployeeIU);
	}

	@DeleteMapping("/delete/{id}")
	@Override
	public void deleteEmployee(@PathVariable(name = "id") Long id) {
		employeeService.deleteEmployee(id);
	}
}
