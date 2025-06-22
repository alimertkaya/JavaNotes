package com.alimertkaya.spring_relations.dto.onetoone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoCustomerIU {
	private String name;
	private String phoneNumber;
	private DtoAddress address;
}