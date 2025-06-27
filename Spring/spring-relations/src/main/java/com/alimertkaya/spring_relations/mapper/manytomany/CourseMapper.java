package com.alimertkaya.spring_relations.mapper.manytomany;

import java.util.List;

import org.mapstruct.Mapper;

import com.alimertkaya.spring_relations.dto.manytomany.DtoCourse;
import com.alimertkaya.spring_relations.entities.manytomany.Course;

@Mapper(componentModel = "spring")
public interface CourseMapper {
	public Course toEntity(DtoCourse dto);
	public DtoCourse toDto(Course entity);
	public List<Course> toEntityList(List<DtoCourse> courseDtos);
}