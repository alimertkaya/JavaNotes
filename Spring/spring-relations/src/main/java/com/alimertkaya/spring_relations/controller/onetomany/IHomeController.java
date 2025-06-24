package com.alimertkaya.spring_relations.controller.onetomany;

import java.util.List;

import com.alimertkaya.spring_relations.dto.onetomany.DtoHome;
import com.alimertkaya.spring_relations.dto.onetomany.DtoHomeIU;

public interface IHomeController {
	public DtoHome saveHome(DtoHomeIU dtoHomeIU);
	public DtoHome getHomeById(Long id);
	public List<DtoHome> getAllHomes();
	public DtoHome updateHome(Long id, DtoHomeIU dtoHomeIU);
	public void deleteHome(Long id);
}

