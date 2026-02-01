package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD_operations {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("main method started");

		// Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loaded Driverr !!");

		// Connect the Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcubejava", "root", "Lucky@27");
		System.out.println("Database Connected !!");

		// ==== CRUD OPERATIONS =====

		// CREATE
		PreparedStatement ps1 = con.prepareStatement("Insert into phones values (?,?,?)");

		ps1.setInt(1, 104);
		ps1.setString(2, "Realme");
		ps1.setDouble(3, 15000);

		ps1.executeUpdate();

		// READ
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("Select * from phones");

		System.out.println("------------------------");
		while (rs.next()) {
			System.out.println("Id :" + rs.getInt(1));
			System.out.println("Mobile : " + rs.getString(2));
			System.out.println("price : " + rs.getDouble(3));
			System.out.println("------------------------");
		}

		// UPDATE
		PreparedStatement ps2 = con.prepareStatement("update phones set price=? where id=?");

		ps2.setDouble(1, 99999);
		ps2.setDouble(2, 101);

		ps2.executeUpdate();

		// DELETE
		PreparedStatement ps3 = con.prepareStatement("Delete from phones where id=?");

		ps3.setInt(1, 104);

		ps3.executeUpdate();

	}
}
