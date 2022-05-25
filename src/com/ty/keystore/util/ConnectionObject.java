package com.ty.keystore.util;

import static com.ty.keystore.util.AppConstants.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionObject {


	public static Connection getConnection() {

		try {
			return DriverManager.getConnection( URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
