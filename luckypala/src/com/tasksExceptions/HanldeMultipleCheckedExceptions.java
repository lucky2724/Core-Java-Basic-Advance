package com.tasksExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HanldeMultipleCheckedExceptions {
	public static void main(String[] args)
			throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {

		File f = new File("C:\\Users\\palal\\OneDrive\\Documents\\luckyPala\\surya2.txt");

		FileReader fr = new FileReader(f);

		fr.read();

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully !!");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vcubejava", "root", "Lucky@27");

		System.out.println("Database Connected Successfullyy..");

		con.close();
		fr.close();
	}
}
