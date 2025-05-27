package com.springintro.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springintro.config.AppConfig;
import com.springintro.model.User;
import com.springintro.services.LoginService;
import com.springintro.services.UserService;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		UserService userService = context.getBean(UserService.class);
		
		for (User user : userService.getUserList()) {
			System.out.println(user);
		}
		
		LoginService loginService = new LoginService();
		loginService.login();
		
	}
}