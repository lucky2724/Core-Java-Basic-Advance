package com.tasksExceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlAndClassNotFoundExceptions {
	public static void main(String[] args) {
		System.out.println("main method started");

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcubejava", "root", "Lucky@27");

			System.out.println("Database connected");

			st = con.createStatement();

			rs = st.executeQuery("select * from emp");

			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println("--------------");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("MySQL Driver not found");
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Database error");
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (con != null)
					con.close();
				System.out.println("Resources closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
