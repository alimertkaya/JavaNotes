package com.alimertkaya.exception_management.service;

import com.alimertkaya.exception_management.dto.DtoEmployee;

public interface IEmployeeService {
	public DtoEmployee findEmployeeById(Long id);
}
