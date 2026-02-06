package com.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	Connection con = null;

	public Connection getDBConnection() {

		try {
			// Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded!!");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcubejava", "root", "Lucky@27");
			System.out.println("Connection Establish !!");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
