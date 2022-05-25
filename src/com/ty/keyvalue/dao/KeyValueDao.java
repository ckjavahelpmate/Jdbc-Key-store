package com.ty.keyvalue.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ty.keystore.dto.KeyValue;
import com.ty.keystore.util.ConnectionObject;

public class KeyValueDao {

	
	public int savekeyvalue(KeyValue keyvalue) {
		Connection connection = ConnectionObject.getConnection() ;
		
		String sql = "insert into key_store values(?,?,?,?)" ;
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql) ;
			preparedStatement.setInt(1, keyvalue.getPid());
			preparedStatement.setString(2, keyvalue.getKey());
			preparedStatement.setString(3, keyvalue.getValue());
			preparedStatement.setString(4, keyvalue.getDesc());
			
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
}
