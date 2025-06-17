package com.alimertkaya.spring_data_jpa.dto;

import java.util.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	
	@NotEmpty(message = "firstName alanı boş bırakılamaz!")
	@Min(value = 3, message = "firstName alanı min 3 karakter olmalı!")
	@Max(value = 10, message = "firstName alanı max 10 karakter olmalı!")
	private String firstName;
	
	@Size(min = 3, max = 30)
	private String lastName;
	private Date dayOfBirth;
}