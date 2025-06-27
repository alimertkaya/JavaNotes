package com.alimertkaya.spring_relations.dto.manytoone;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoEmployeeIU {
	private String name;
	private BigDecimal salary;
	private DtoDepartment departmentName;
}
