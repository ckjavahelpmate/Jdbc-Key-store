package com.ty.keystore.service;

import com.ty.keystore.dto.User;
import com.ty.keyvalue.dao.UserDao;

public class UserService {

	UserDao dao = new UserDao() ;
	
	public int saveUser(User user) {
		
		return dao.saveUser(user) ;
	}
	
	public User getUserByid(int id) {
		
		User user = dao.getUserById(id) ;
		
		return user ;
		
	}
}
