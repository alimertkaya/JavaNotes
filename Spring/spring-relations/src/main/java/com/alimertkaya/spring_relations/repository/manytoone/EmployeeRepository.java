package com.alimertkaya.spring_relations.repository.manytoone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alimertkaya.spring_relations.entities.manytoone.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
