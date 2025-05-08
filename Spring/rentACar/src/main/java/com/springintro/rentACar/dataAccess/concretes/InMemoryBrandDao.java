package com.springintro.rentACar.dataAccess.concretes;

import com.springintro.rentACar.dataAccess.abstracts.BrandDao;
import com.springintro.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // bu sınıf bir dataAccess nesnesidir
public class InMemoryBrandDao implements BrandDao {
    List<Brand> brands;

    public InMemoryBrandDao() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Mercedes"));
        brands.add(new Brand(3, "Audi"));
        brands.add(new Brand(4, "Fiat"));
        brands.add(new Brand(5, "Renault"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
