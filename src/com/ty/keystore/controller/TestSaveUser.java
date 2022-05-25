package com.ty.keystore.controller;

import com.ty.keystore.dto.User;
import com.ty.keystore.service.UserService;

public class TestSaveUser {

	public static void main(String[] args) {
		
		UserService service = new UserService() ;
		User user = new User() ;
		user.setId(1);
		user.setUsername("Leela");
		user.setEmail("Leela@mail.com");
		user.setPassword("leela123");
		
		int res = service.saveUser(user) ;

		if( res!= 0 ) System.out.println("Data insered");
		else System.out.println("No data inserted");
		
	}

}
