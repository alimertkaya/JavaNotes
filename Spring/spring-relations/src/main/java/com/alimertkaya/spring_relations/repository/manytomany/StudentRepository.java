package com.alimertkaya.spring_relations.repository.manytomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alimertkaya.spring_relations.entities.manytomany.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
