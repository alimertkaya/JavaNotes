package com.alimertkaya.spring_relations.controller.manytomany.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alimertkaya.spring_relations.controller.manytomany.IStudentController;
import com.alimertkaya.spring_relations.dto.manytomany.DtoStudent;
import com.alimertkaya.spring_relations.dto.manytomany.DtoStudentIU;
import com.alimertkaya.spring_relations.service.manytomany.IStudentService;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

	@Autowired
	private IStudentService studentService;
	
	@PostMapping("/save")
	@Override
	public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {
		return studentService.saveStudent(dtoStudentIU);
	}
	
	@GetMapping("/list/{id}")
	@Override
	public DtoStudent getStudentById(@PathVariable(name = "id") Long id) {
		return studentService.getStudentById(id);
	}

	@GetMapping("/list")
	@Override
	public List<DtoStudent> getAllStudents() {
		return studentService.getAllStudents();
	}

	@PutMapping("/update/{id}")
	@Override
	public DtoStudent updateStudent(@PathVariable(name = "id") Long id, @RequestBody DtoStudentIU dtoStudentIU) {
		return studentService.updateStudent(id, dtoStudentIU);
	}

	@DeleteMapping("/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable(name = "id") Long id) {
		studentService.deleteStudent(id);		
	}
}
