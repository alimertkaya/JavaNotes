package com.springintro.services;

import java.util.List;

import com.springintro.model.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserService {
	
	private List<User> userList;
}
