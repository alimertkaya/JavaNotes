package com.alimertkaya.spring_relations.mapper.onetomany;

import org.mapstruct.Mapper;

import com.alimertkaya.spring_relations.dto.onetomany.DtoRoom;
import com.alimertkaya.spring_relations.entities.onetomany.Room;

@Mapper(componentModel = "spring")
public interface RoomMapper {
	public Room toEntity(DtoRoom dto);
	public DtoRoom toDto(Room entity);
}
