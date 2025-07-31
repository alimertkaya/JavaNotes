package com.alimertkaya.exception_management.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alimertkaya.exception_management.controller.RestEmployeeController;
import com.alimertkaya.exception_management.dto.DtoEmployee;
import com.alimertkaya.exception_management.model.RootEntity;
import com.alimertkaya.exception_management.service.IEmployeeService;

@RestController
@RequestMapping("/rest/api/employee")
public class RestEmployeeControllerImpl extends RestBaseController implements RestEmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/list/{id}")
	@Override
	public RootEntity<DtoEmployee> findEmployeeById(@PathVariable(value = "id") Long id) {
		return ok(employeeService.findEmployeeById(id));
	}
}
