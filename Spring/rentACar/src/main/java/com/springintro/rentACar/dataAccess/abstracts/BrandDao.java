package com.springintro.rentACar.dataAccess.abstracts;

import com.springintro.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandDao extends JpaRepository<Brand,Integer> {

}
