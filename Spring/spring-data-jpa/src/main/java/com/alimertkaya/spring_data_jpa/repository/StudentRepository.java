package com.alimertkaya.spring_data_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.alimertkaya.spring_data_jpa.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	// Kendi özel metotlarımızı yazarız.
	
	// HQL (false): class ın name ve variables isimleri
	// SQL (true): table name ve column isimleri
	//@Query(value = "from Student", nativeQuery = false)
	//List<Student> findAllStudents();
	
	//@Query(value = "from * from student.student", nativeQuery = true)
	//List<Student> findAllStudents();
}
