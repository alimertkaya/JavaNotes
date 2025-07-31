package com.alimertkaya.exception_management.mapper;

import org.mapstruct.Mapper;

import com.alimertkaya.exception_management.dto.DtoEmployee;
import com.alimertkaya.exception_management.model.Employee;

@Mapper(componentModel = "spring", uses = DepartmentMapper.class)
public interface EmployeeMapper {
	public Employee toEntity(DtoEmployee dtoEmployee);
	
	public DtoEmployee toDto(Employee entity);
}
