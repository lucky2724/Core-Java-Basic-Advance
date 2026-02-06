package com.JDBCConnection;

public interface Main {
	public static void main(String[] args) {
		System.out.println("main method started");

		JDBCMethods jdbc = new JDBCMethods();

//		jdbc.insert();

		jdbc.update();

		// jdbc.delete();

		jdbc.selectAll();
	}
}
