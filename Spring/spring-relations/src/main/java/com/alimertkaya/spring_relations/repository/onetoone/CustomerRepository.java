package com.alimertkaya.spring_relations.repository.onetoone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alimertkaya.spring_relations.entities.onetoone.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}
