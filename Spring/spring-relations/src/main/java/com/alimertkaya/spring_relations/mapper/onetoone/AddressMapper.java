package com.alimertkaya.spring_relations.mapper.onetoone;

import org.mapstruct.Mapper;

import com.alimertkaya.spring_relations.dto.onetoone.DtoAddress;
import com.alimertkaya.spring_relations.entities.onetoone.Address;

@Mapper(componentModel = "spring")
public interface AddressMapper {
	public Address toEntity(DtoAddress dto);
	public DtoAddress toDto(Address entity);
}
