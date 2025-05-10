package com.springintro.rentACar.business.concretes;

import com.springintro.rentACar.business.abstracts.BrandService;
import com.springintro.rentACar.business.requests.CreateBrandRequest;
import com.springintro.rentACar.business.responses.GetAllBrandsResponse;
import com.springintro.rentACar.core.utilities.mappers.ModelMapperService;
import com.springintro.rentACar.dataAccess.abstracts.BrandDao;
import com.springintro.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service // bu sınıf bir business nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandDao brandDao;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandDao.findAll();
//        List<GetAllBrandsResponse> brandsResponses = new ArrayList<>();
//
//        for (Brand brand : brands) {
//            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
//            responseItem.setId(brand.getId());
//            responseItem.setName(brand.getName());
//            brandsResponses.add(responseItem);
//        }

        List<GetAllBrandsResponse> brandsResponses = brands.stream()
                .map(brand -> this.modelMapperService.forResponse().map(brand,GetAllBrandsResponse.class))
                .collect(Collectors.toList());
        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
//        Brand brand = new Brand();
//        brand.setName(createBrandRequest.getName());

        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);

        this.brandDao.save(brand);
    }
}
