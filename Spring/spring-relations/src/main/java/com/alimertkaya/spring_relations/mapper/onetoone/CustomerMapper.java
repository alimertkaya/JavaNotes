package com.alimertkaya.spring_relations.mapper.onetoone;

import org.mapstruct.Mapper;

import com.alimertkaya.spring_relations.dto.onetoone.DtoCustomer;
import com.alimertkaya.spring_relations.dto.onetoone.DtoCustomerIU;
import com.alimertkaya.spring_relations.entities.onetoone.Customer;

@Mapper(componentModel = "spring", uses = AddressMapper.class)
public interface CustomerMapper {
	public Customer toEntity(DtoCustomerIU dto);
	
	public DtoCustomer toDto(Customer entity);
}
