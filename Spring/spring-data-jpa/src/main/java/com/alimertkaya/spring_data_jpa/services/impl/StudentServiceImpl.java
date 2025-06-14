package com.alimertkaya.spring_data_jpa.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alimertkaya.spring_data_jpa.dto.DtoStudent;
import com.alimertkaya.spring_data_jpa.dto.DtoStudentIU;
import com.alimertkaya.spring_data_jpa.entities.Student;
import com.alimertkaya.spring_data_jpa.repository.StudentRepository;
import com.alimertkaya.spring_data_jpa.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
		DtoStudent response = new DtoStudent();
		Student student = new Student();
		BeanUtils.copyProperties(dtoStudentIU, student);
		
		Student dbStudent = studentRepository.save(student);
		BeanUtils.copyProperties(dbStudent, response);
		return response;
	}

	@Override
	public List<DtoStudent> getAllStudents() {
		List<DtoStudent> dtoList = new ArrayList<DtoStudent>();
		
		List<Student> studentList = studentRepository.findAll();
		for (Student student : studentList) {
			DtoStudent dto = new DtoStudent();
			BeanUtils.copyProperties(student, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}

	@Override
	public DtoStudent getStudentById(Integer id) {
		DtoStudent dtoStudent = new DtoStudent();
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			Student dbStudent = optional.get();
			
			BeanUtils.copyProperties(dbStudent, dtoStudent);
		}
		return dtoStudent;
	}

	@Override
	public void deleteStudent(Integer id) {
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			studentRepository.delete(optional.get());
		}
		
//		DtoStudent dtoStudent = getStudentById(id);
//		if (dtoStudent != null) {
//			studentRepository.delete(dtoStudent);
//		}
	}

	@Override
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
		DtoStudent dto = new DtoStudent();
		
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			Student dbStudent = optional.get();
			
			dbStudent.setFirstName(dtoStudentIU.getFirstName());
			dbStudent.setLastName(dtoStudentIU.getLastName());
			dbStudent.setDayOfBirth(dtoStudentIU.getDayOfBirth());
			
			Student updatedStudent = studentRepository.save(dbStudent);
			
			BeanUtils.copyProperties(updatedStudent, dto);
			return dto;
		}
		return null;
		
		
//		Student student = getStudentById(id);
//		if (student != null) {
//			student.setFirstName(updateStudent.getFirstName());
//			student.setLastName(updateStudent.getLastName());
//			student.setDayOfBirth(updateStudent.getDayOfBirth());
//			
//			return studentRepository.save(student);
//		}
	}
}
