package com.alimertkaya.exception_management.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alimertkaya.exception_management.dto.DtoEmployee;
import com.alimertkaya.exception_management.exception.BaseException;
import com.alimertkaya.exception_management.exception.ErrorMessage;
import com.alimertkaya.exception_management.exception.MessageType;
import com.alimertkaya.exception_management.mapper.EmployeeMapper;
import com.alimertkaya.exception_management.model.Employee;
import com.alimertkaya.exception_management.repository.EmployeeRepository;
import com.alimertkaya.exception_management.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public DtoEmployee findEmployeeById(Long id) {
		Optional<Employee> optional = employeeRepository.findById(id);
		if (optional.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, id.toString()));
		}
		return employeeMapper.toDto(optional.get());
	}
	
}