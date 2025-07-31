package com.alimertkaya.exception_management.mapper;

import org.mapstruct.Mapper;

import com.alimertkaya.exception_management.dto.DtoDepartment;
import com.alimertkaya.exception_management.model.Department;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
	public Department toEntity(DtoDepartment dto);
	public DtoDepartment toDto(Department entity);
}
