package com.alimertkaya.spring_relations.service.onetoone.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alimertkaya.spring_relations.dto.onetoone.DtoCustomer;
import com.alimertkaya.spring_relations.dto.onetoone.DtoCustomerIU;
import com.alimertkaya.spring_relations.entities.onetoone.Customer;
import com.alimertkaya.spring_relations.mapper.onetoone.AddressMapper;
import com.alimertkaya.spring_relations.mapper.onetoone.CustomerMapper;
import com.alimertkaya.spring_relations.repository.onetoone.CustomerRepository;
import com.alimertkaya.spring_relations.service.onetoone.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired
	private AddressMapper addressMapper;
	
	@Override
	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU) {
	    // System.out.println("Gelen DTO: " + dtoCustomerIU);
	    
		Customer customer = customerMapper.toEntity(dtoCustomerIU);
	    // System.out.println("Entity: " + customer);

		Customer dbCustomer = customerRepository.save(customer);
	    // System.out.println("Saved: " + dbCustomer);

	    DtoCustomer dto = customerMapper.toDto(dbCustomer);
	    // System.out.println("Dto: " + dto);
		return dto;
	}

	@Override
	public DtoCustomer getCustomerById(Long id) {
		Optional<Customer> optional = customerRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		
		return customerMapper.toDto(optional.get());
	}

	@Override
	public List<DtoCustomer> getAllCustomers() {
		List<Customer> customerList = customerRepository.findAll();
		List<DtoCustomer> dtoList = new ArrayList<DtoCustomer>();
		
		for (Customer customer : customerList) {
			dtoList.add(customerMapper.toDto(customer));
		}
		return dtoList;
	}

	@Override
	public DtoCustomer updateCustomer(Long id, DtoCustomerIU dtoCustomerIU) {
		Optional<Customer> optional = customerRepository.findById(id);
		if (optional.isPresent()) {
			Customer dbCustomer = optional.get();
			
			dbCustomer.setName(dtoCustomerIU.getName());
			dbCustomer.setPhoneNumber(dtoCustomerIU.getPhoneNumber());
			dbCustomer.setAddress(addressMapper.toEntity(dtoCustomerIU.getAddress()));
			
			return customerMapper.toDto(customerRepository.save(dbCustomer));
		}
		
		return null;
	}

	@Override
	public void deleteCustomer(Long id) {
		Optional<Customer> optional = customerRepository.findById(id);
		if (optional.isPresent()) {
			customerRepository.delete(optional.get());
		}
	}

}