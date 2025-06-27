package com.alimertkaya.spring_relations.service.manytoone.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alimertkaya.spring_relations.dto.manytoone.DtoEmployee;
import com.alimertkaya.spring_relations.dto.manytoone.DtoEmployeeIU;
import com.alimertkaya.spring_relations.entities.manytoone.Employee;
import com.alimertkaya.spring_relations.mapper.manytoone.DepartmentMapper;
import com.alimertkaya.spring_relations.mapper.manytoone.EmployeeMapper;
import com.alimertkaya.spring_relations.repository.manytoone.EmployeeRepository;
import com.alimertkaya.spring_relations.service.manytoone.IEmployeeService;

@Service
public class EmloyeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Override
	public DtoEmployee saveEmployee(DtoEmployeeIU dtoEmployeeIU) {
		Employee employee = employeeMapper.toEntity(dtoEmployeeIU);
		
		Employee dbEmployee = employeeRepository.save(employee);
				
		return employeeMapper.toDto(dbEmployee);
	}
	
	@Override
	public DtoEmployee getEmployeeById(Long id) {
		
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		return employeeMapper.toDto(optional.get());
	}

	@Override
	public List<DtoEmployee> getAllEmployees() {
		List<Employee> employeeList = employeeRepository.findAll();
		return employeeMapper.toDtoList(employeeList);
	}

	@Override
	public DtoEmployee updateEmployee(Long id, DtoEmployeeIU dtoEmployeeIU) {
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isPresent()) {
			Employee dbEmployee = optional.get();
			updateEmployeeFields(dbEmployee, dtoEmployeeIU);
			
			Employee udaptedEmployee =employeeRepository.save(dbEmployee);
			return employeeMapper.toDto(udaptedEmployee);
		}
		return null;
	}

	@Override
	public void deleteEmployee(Long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isPresent()) {
			employeeRepository.delete(optional.get());			
		}
	}
	
	public void updateEmployeeFields(Employee employee, DtoEmployeeIU dto) {
		if (dto.getName() != null) {
			employee.setName(dto.getName());
		}
		
		if (dto.getSalary() != null) {
			employee.setSalary(dto.getSalary());
		}
		
		if (dto.getDepartmentName() != null) {
			employee.setDepartmentName(departmentMapper.toEntity(dto.getDepartmentName()));
		}
	}
}
