package com.alimertkaya.spring_relations.service.onetoone;

import java.util.List;

import com.alimertkaya.spring_relations.dto.onetoone.DtoCustomer;
import com.alimertkaya.spring_relations.dto.onetoone.DtoCustomerIU;

public interface ICustomerService {

	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
	public DtoCustomer getCustomerById(Long id);
	public List<DtoCustomer> getAllCustomers();
	public DtoCustomer updateCustomer(Long id, DtoCustomerIU dtoCustomerIU);
	public void deleteCustomer(Long id);
	
}