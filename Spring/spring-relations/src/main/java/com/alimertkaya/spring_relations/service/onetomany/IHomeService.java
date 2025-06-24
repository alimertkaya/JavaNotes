package com.alimertkaya.spring_relations.service.onetomany;

import java.util.List;

import com.alimertkaya.spring_relations.dto.onetomany.DtoHome;
import com.alimertkaya.spring_relations.dto.onetomany.DtoHomeIU;

public interface IHomeService {
	public DtoHome saveHome(DtoHomeIU dtoHomeIU);
	public DtoHome getHomeById(Long id);
	public List<DtoHome> getAllHomes();
	public DtoHome updatehome(Long id, DtoHomeIU dtoHomeIU);
	public void deleteHome(Long id);
}
