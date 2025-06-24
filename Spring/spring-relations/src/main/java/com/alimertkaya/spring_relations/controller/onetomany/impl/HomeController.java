package com.alimertkaya.spring_relations.controller.onetomany.impl;

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

import com.alimertkaya.spring_relations.controller.onetomany.IHomeController;
import com.alimertkaya.spring_relations.dto.onetomany.DtoHome;
import com.alimertkaya.spring_relations.dto.onetomany.DtoHomeIU;
import com.alimertkaya.spring_relations.service.onetomany.IHomeService;

@RestController
@RequestMapping("/rest/api/home")
public class HomeController implements IHomeController {

	@Autowired
	private IHomeService homeService;
	
	@PostMapping("/save")
	@Override
	public DtoHome saveHome(@RequestBody DtoHomeIU dtoHomeIU) {
		return homeService.saveHome(dtoHomeIU);
	}
	
	@GetMapping("/list/{id}")
	@Override
	public DtoHome getHomeById(@PathVariable(name = "id") Long id) {
		return homeService.getHomeById(id);
	}

	@GetMapping("/list")
	@Override
	public List<DtoHome> getAllHomes() {
		return homeService.getAllHomes();
	}

	@PutMapping("/update/{id}")
	@Override
	public DtoHome updateHome(@PathVariable(name = "id") Long id, @RequestBody DtoHomeIU dtoHomeIU) {
		return homeService.updatehome(id, dtoHomeIU);
	}

	@DeleteMapping("/delete/{id}")
	@Override
	public void deleteHome(@PathVariable(name = "id") Long id) {
		homeService.deleteHome(id);		
	}
}