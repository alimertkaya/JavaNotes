package com.alimertkaya.spring_relations.mapper.manytoone;

import org.mapstruct.Mapper;

import com.alimertkaya.spring_relations.dto.manytoone.DtoDepartment;
import com.alimertkaya.spring_relations.entities.manytoone.Department;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {
	public Department toEntity(DtoDepartment dto);
	
	public DtoDepartment toDto(Department entity);
}
