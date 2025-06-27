package com.alimertkaya.spring_relations.controller.manytoone;

import java.util.List;

import com.alimertkaya.spring_relations.dto.manytoone.DtoEmployee;
import com.alimertkaya.spring_relations.dto.manytoone.DtoEmployeeIU;

public interface IEmployeeController {
	public DtoEmployee saveEmployee(DtoEmployeeIU dtoEmployeeIU);
	public DtoEmployee getEmployeeById(Long id);
	public List<DtoEmployee> getAllEmployees();
	public DtoEmployee updateEmployee(Long id, DtoEmployeeIU dtoEmployeeIU);
	public void deleteEmployee(Long id);
}
