package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectingPract {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started !!!!");

		// step 1 : Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded SuccessFullyy");

		// step 2 : Connect the database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcubejava", "root", "Lucky@27");
		System.out.println("Database Connected Successfully");

		// step 3 : Create Statement
		Statement st = con.createStatement();

		// step 4 : Fetch the data
		String sql = "select * from company";
		ResultSet rs = st.executeQuery(sql);

		int count = 1;
		while (rs.next()) {
			System.out.println("------ Row " + count++ + " ---------------");
			System.out.println("Id     : " + rs.getInt(1));
			System.out.println("Name   : " + rs.getString(2));
			System.out.println("Salary : " + rs.getDouble(3));
			System.out.println("----------------------------");
		}

		// Step : 5 Close the all connections
		rs.close();
		st.close();
		con.close();

		System.out.println("main method ended !!!!!");
	}
}
