package com.springintro.rentACar.business.abstracts;

import com.springintro.rentACar.business.requests.CreateBrandRequest;
import com.springintro.rentACar.business.responses.GetAllBrandsResponse;
import com.springintro.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
