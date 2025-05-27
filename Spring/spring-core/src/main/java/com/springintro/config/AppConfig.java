package com.springintro.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springintro.model.User;
import com.springintro.services.UserService;

@Configuration
public class AppConfig {
	
	@Bean
	public UserService userService() {
		UserService userService = new UserService();
		
		List<User> userList = new ArrayList<>();
		userList.add(new User("Enes"));
		userList.add(new User("Mert"));
		
		userService.setUserList(userList);
		return userService;
	}
	
}
