package com.alimertkaya.spring_relations.mapper.onetomany;

import org.mapstruct.Mapper;

import com.alimertkaya.spring_relations.dto.onetomany.DtoHome;
import com.alimertkaya.spring_relations.dto.onetomany.DtoHomeIU;
import com.alimertkaya.spring_relations.entities.onetomany.Home;

@Mapper(componentModel = "spring", uses = RoomMapper.class)
public interface HomeMapper {
	public Home toEntity(DtoHomeIU dto);
	public DtoHome toDto(Home entity);
}
