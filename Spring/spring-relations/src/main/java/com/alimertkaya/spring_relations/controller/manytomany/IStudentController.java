package com.alimertkaya.spring_relations.controller.manytomany;

import java.util.List;

import com.alimertkaya.spring_relations.dto.manytomany.DtoStudent;
import com.alimertkaya.spring_relations.dto.manytomany.DtoStudentIU;

public interface IStudentController {
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	public DtoStudent getStudentById(Long id);
	public List<DtoStudent> getAllStudents();
	public DtoStudent updateStudent(Long id, DtoStudentIU dtoStudentIU);
	public void deleteStudent(Long id);
}