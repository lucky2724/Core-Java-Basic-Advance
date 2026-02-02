package com.practVcube;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseConnect {
	public static void main(String[] args) {
		System.out.println("main method stated");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcubejava", "root", "Lucky@27");
			System.out.println("Connection Successfully !!");

			Statement st = con.createStatement();

			String sql = "Select * from emp";

			ResultSet rs = st.executeQuery(sql);

			System.out.println("---------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println("---------------------");
			}

		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
