package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice06 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started");

		// step 1 : Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("Driver Loaded Successfully..");

		// stept 2: Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcubejava", "root", "Lucky@27");
		System.out.println("Database Connected Successfullyy");

		// step 3: create Statements
		Statement st = con.createStatement();

		// Step 4:Retriving the data
		String sql = "SELECT * FROM customer";
		ResultSet rs = st.executeQuery(sql);

		System.out.println("------------------------------");
		while (rs.next()) {
			System.out.println("Id     : " + rs.getInt(1));
			System.out.println("Name   :" + rs.getString(2));
			System.out.println("mobile : " + rs.getLong(3));
			System.out.println("------------------------------");
		}

		// step : 5 close all connections
		con.close();
		st.close();
		rs.close();

	}
}
