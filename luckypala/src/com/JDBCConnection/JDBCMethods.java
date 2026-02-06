package com.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCMethods implements JDBCInterface {

	DBConnection db = new DBConnection();
	Connection con = db.getDBConnection();

	@Override
	public void insert() {
		try {
			PreparedStatement ps = con.prepareStatement("Insert into lucky values (?,?,?)");

			ps.setInt(1, 4);
			ps.setString(2, "Shiva Reddy");
			ps.setString(3, "MCA");

			int n = ps.executeUpdate();

			if (n > 0) {
				System.out.println(n + " row inserted..");
			} else {
				System.out.println("Something went Wrong !!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectAll() {

		try {
			PreparedStatement ps = con.prepareStatement("Select * from lucky");

			ResultSet rs = ps.executeQuery();

			System.out.println("-----------------------------");
			while (rs.next()) {
				System.out.println("Id     : " + rs.getInt(1));
				System.out.println("Name   : " + rs.getString(2));
				System.out.println("Branch : " + rs.getString(3));
				System.out.println("-----------------------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update() {

		try {
			PreparedStatement ps = con.prepareStatement("Update lucky set branch=? where id=?");

			ps.setString(1, "MSC.AQUA");
			ps.setInt(2, 3);

			int n = ps.executeUpdate();

			if (n > 0) {
				System.out.println(n + " row Updated..");
			} else {
				System.out.println("Something Went Wrong !!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		try {
			PreparedStatement ps = con.prepareStatement("Delete from lucky where id=?");

			ps.setInt(1, 3);

			int n = ps.executeUpdate();

			if (n > 0) {
				System.out.println(n + " row Deleted..");
			} else {
				System.out.println("Something Went Wrong!!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
