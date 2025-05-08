package com.springintro.rentACar.business.concretes;

import com.springintro.rentACar.business.abstracts.BrandService;
import com.springintro.rentACar.dataAccess.abstracts.BrandDao;
import com.springintro.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // bu sınıf bir business nesnesidir
public class BrandManager implements BrandService {
    private BrandDao brandDao;

    @Autowired
    public BrandManager(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    @Override
    public List<Brand> getAll() {
        return brandDao.getAll();
    }
}
