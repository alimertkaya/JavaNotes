package com.alimertkaya.spring_relations.service.manytomany.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alimertkaya.spring_relations.dto.manytomany.DtoStudent;
import com.alimertkaya.spring_relations.dto.manytomany.DtoStudentIU;
import com.alimertkaya.spring_relations.entities.manytomany.Student;
import com.alimertkaya.spring_relations.mapper.manytomany.CourseMapper;
import com.alimertkaya.spring_relations.mapper.manytomany.StudentMapper;
import com.alimertkaya.spring_relations.repository.manytomany.StudentRepository;
import com.alimertkaya.spring_relations.service.manytomany.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private CourseMapper courseMapper;
	
	@Override
	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
		Student student = studentMapper.toEntity(dtoStudentIU);
		Student dbStudent = studentRepository.save(student);
		return studentMapper.toDto(dbStudent);
	}
	
	@Override
	public DtoStudent getStudentById(Long id) {
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		return studentMapper.toDto(optional.get());
	}

	@Override
	public List<DtoStudent> getAllStudents() {
		List<Student> studentList = studentRepository.findAll();
		return studentMapper.toDtoList(studentList);
	}

	@Override
	public DtoStudent updateStudent(Long id, DtoStudentIU dtoStudentIU) {
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			Student student = optional.get();
			updateStudentFields(student, dtoStudentIU);
			
			Student updatedStudent = studentRepository.save(student);
			return studentMapper.toDto(updatedStudent);
			
		}
		return null;
	}
	
	@Override
	public void deleteStudent(Long id) {
		Optional<Student> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			studentRepository.delete(optional.get());
		}
	}
	
	public void updateStudentFields(Student student, DtoStudentIU dto) {
		if (dto.getName() != null) {
			student.setName(dto.getName());
		}
		
		if (dto.getNote() != null) {
			student.setNote(dto.getNote());
		}
		
		if (dto.getCourses() != null) {
			student.setCourses(courseMapper.toEntityList(dto.getCourses()));
		}
	}
}