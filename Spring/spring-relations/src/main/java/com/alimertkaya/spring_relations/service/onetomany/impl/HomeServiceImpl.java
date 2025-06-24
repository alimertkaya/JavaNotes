package com.alimertkaya.spring_relations.service.onetomany.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alimertkaya.spring_relations.dto.onetomany.DtoHome;
import com.alimertkaya.spring_relations.dto.onetomany.DtoHomeIU;
import com.alimertkaya.spring_relations.dto.onetomany.DtoRoom;
import com.alimertkaya.spring_relations.entities.onetomany.Home;
import com.alimertkaya.spring_relations.mapper.onetomany.HomeMapper;
import com.alimertkaya.spring_relations.mapper.onetomany.RoomMapper;
import com.alimertkaya.spring_relations.repository.onetomany.HomeRepository;
import com.alimertkaya.spring_relations.service.onetomany.IHomeService;

@Service
public class HomeServiceImpl implements IHomeService {

	@Autowired
	private HomeRepository homeRepository;
	
	@Autowired
	private HomeMapper homeMapper;
	
	@Autowired
	private RoomMapper roomMapper;
	
	@Override
	public DtoHome saveHome(DtoHomeIU dtoHomeIU) {
		System.out.println("Gelen DTO: " + dtoHomeIU);
		Home home = homeMapper.toEntity(dtoHomeIU);
		
		System.out.println("Entity: " + home);
		
		Home dbHome = homeRepository.save(home);
		System.out.println("Saved: " + dbHome);
		
		DtoHome dto = homeMapper.toDto(dbHome);
		return dto;
	}
	
	@Override
	public DtoHome getHomeById(Long id) {
		
		Optional<Home> optional = homeRepository.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		
		return homeMapper.toDto(optional.get());
	}

	@Override
	public List<DtoHome> getAllHomes() {
		List<Home> homeList = homeRepository.findAll();
		List<DtoHome> dtoList = new ArrayList<DtoHome>();
		
		for (Home home : homeList) {
			dtoList.add(homeMapper.toDto(home));
		}
		
		return dtoList;
	}

	@Override
	public DtoHome updatehome(Long id, DtoHomeIU dtoHomeIU) {
		Optional<Home> optional = homeRepository.findById(id);
		
		if (optional.isPresent()) {
			Home dbHome = optional.get();
			dbHome.setPrice(dtoHomeIU.getPrice());
			dbHome.getRoom().clear();
			
			for (DtoRoom room : dtoHomeIU.getRoom()) {
				dbHome.getRoom().add(roomMapper.toEntity(room));
			}
			
//			List<Room> updatedRooms = dtoHomeIU.getRoom().stream()
//					.map(roomDto -> roomMapper.toEntity(roomDto))
//					.collect(Collectors.toList());
//			dbHome.getRoom().addAll(updatedRooms);
			
			Home updatedHome = homeRepository.save(dbHome);
			return homeMapper.toDto(updatedHome);
		}
		
		return null;
	}

	@Override
	public void deleteHome(Long id) {
		Optional<Home> optional = homeRepository.findById(id);
		if (optional.isPresent()) {
			homeRepository.delete(optional.get());
		}
	}
}
