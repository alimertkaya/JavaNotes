package com.alimertkaya.spring_relations.controller.onetoone.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alimertkaya.spring_relations.controller.onetoone.ICustomerController;
import com.alimertkaya.spring_relations.dto.onetoone.DtoCustomer;
import com.alimertkaya.spring_relations.dto.onetoone.DtoCustomerIU;
import com.alimertkaya.spring_relations.service.onetoone.ICustomerService;

@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControllerImpl implements ICustomerController {

	@Autowired
	private ICustomerService customerService;
	
	@PostMapping(path = "/save")
	@Override
	public DtoCustomer saveCustomer(@RequestBody DtoCustomerIU dtoCustomerIU) {
		return customerService.saveCustomer(dtoCustomerIU);
	}

	@GetMapping(path = "/list/{id}")
	@Override
	public DtoCustomer getCustomerById(@PathVariable(name = "id") Long id) {
		return customerService.getCustomerById(id);
	}

	@GetMapping(path = "/list")
	@Override
	public List<DtoCustomer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@PutMapping(path = "/update/{id}")
	@Override
	public DtoCustomer updateCustomer(@PathVariable(name = "id") Long id, @RequestBody DtoCustomerIU dtoCustomerIU) {
		return customerService.updateCustomer(id, dtoCustomerIU);
	}

	@DeleteMapping(path = "/delete/{id}")
	@Override
	public void deleteCustomer(@PathVariable(name = "id") Long id) {
		customerService.deleteCustomer(id);
	}
}