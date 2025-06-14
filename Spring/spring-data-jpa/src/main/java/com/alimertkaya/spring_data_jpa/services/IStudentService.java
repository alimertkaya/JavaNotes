package com.alimertkaya.spring_data_jpa.services;

import java.util.List;

import com.alimertkaya.spring_data_jpa.dto.DtoStudent;
import com.alimertkaya.spring_data_jpa.dto.DtoStudentIU;
import com.alimertkaya.spring_data_jpa.entities.Student;

public interface IStudentService {
	
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
