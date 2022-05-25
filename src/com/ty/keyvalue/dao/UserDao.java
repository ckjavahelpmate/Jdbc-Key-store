package com.ty.keyvalue.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.keystore.dto.User;
import com.ty.keystore.util.ConnectionObject;

public class UserDao {

	public int saveUser(User user) {
		Connection connection = ConnectionObject.getConnection() ;
		
		String sql = "insert into user values(?,?,?,?)" ;
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql) ;
			preparedStatement.setInt(1, user.getId());
			preparedStatement.setString(2, user.getUsername());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			
			return preparedStatement.executeUpdate() ;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		return 0 ;
	}
	
	public User getUserById(int id) {
		User user = new User() ;
		
		
		return user ;
	}
}
