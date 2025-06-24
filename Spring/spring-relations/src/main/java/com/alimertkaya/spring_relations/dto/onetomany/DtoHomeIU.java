package com.alimertkaya.spring_relations.dto.onetomany;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoHomeIU {
	private BigDecimal price;
	private List<DtoRoom> room;
}
