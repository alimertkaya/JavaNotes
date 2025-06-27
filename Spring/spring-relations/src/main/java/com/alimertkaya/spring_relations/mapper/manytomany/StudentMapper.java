package com.alimertkaya.spring_relations.mapper.manytomany;

import java.util.List;

import org.mapstruct.Mapper;

import com.alimertkaya.spring_relations.dto.manytomany.DtoStudent;
import com.alimertkaya.spring_relations.dto.manytomany.DtoStudentIU;
import com.alimertkaya.spring_relations.entities.manytomany.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {
	public Student toEntity(DtoStudentIU dto);
	public DtoStudent toDto(Student entity);
	public List<DtoStudent> toDtoList(List<Student> students); 
}
