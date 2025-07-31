package com.alimertkaya.exception_management.controller;

import com.alimertkaya.exception_management.dto.DtoEmployee;
import com.alimertkaya.exception_management.model.RootEntity;

public interface RestEmployeeController {
	public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
