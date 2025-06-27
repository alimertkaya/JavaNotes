package com.alimertkaya.spring_relations.dto.manytomany;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	private String name;
	private Double note;
	private List<DtoCourse> courses;
}