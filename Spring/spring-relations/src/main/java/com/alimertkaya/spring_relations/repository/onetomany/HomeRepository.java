package com.alimertkaya.spring_relations.repository.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alimertkaya.spring_relations.entities.onetomany.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {

}
