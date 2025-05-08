package com.springintro.rentACar.dataAccess.abstracts;

import com.springintro.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandDao {
    List<Brand> getAll();
}
