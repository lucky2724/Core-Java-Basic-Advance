package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DATABASE_CONNECTINON {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started");

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			// Step 1 : Loading the SQL Driver Class
			//ClassNotFoundException
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Class Loaded Successfullyyy..");

			// Step 2 : Establish the Database Connection
			//SQLException
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcubejava", "root", "Lucky@27");

			System.out.println("Database Connected to Successfullyy..");

			// Step 3 : Create a Statement Object to Communicate with data base
			st = con.createStatement();

			// Step 4 : Create a ResultSet to Read the Data.
			String sql = "select * from emp";
			rs = st.executeQuery(sql);

			System.out.println("-----------------------");
			while (rs.next()) {
				System.out.println("Employee Id   :"+rs.getInt(1));
				System.out.println("Employee Name :"+rs.getString(2));
				System.out.println("Employee Job  :"+rs.getString(3));
				System.out.println("Employee Sal  :"+rs.getInt(6));
				System.out.println("-----------------------");
			}
		} finally {
			// Step 5 : Close all the Connections
			rs.close();
			st.close();
			con.close();
		}

		System.out.println("main method started");

	}
}
