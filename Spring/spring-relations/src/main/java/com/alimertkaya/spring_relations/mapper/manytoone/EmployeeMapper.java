package com.alimertkaya.spring_relations.mapper.manytoone;

import java.util.List;

import org.mapstruct.Mapper;

import com.alimertkaya.spring_relations.dto.manytoone.DtoEmployee;
import com.alimertkaya.spring_relations.dto.manytoone.DtoEmployeeIU;
import com.alimertkaya.spring_relations.entities.manytoone.Employee;

@Mapper(componentModel = "spring", uses = DepartmentMapper.class)
public interface EmployeeMapper {
	public Employee toEntity(DtoEmployeeIU dto);
	
	public DtoEmployee toDto(Employee entity);
	
	public List<DtoEmployee> toDtoList(List<Employee> employees);
	
}
