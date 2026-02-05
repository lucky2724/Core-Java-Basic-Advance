package com.strings;

import java.util.Scanner;

public class StringMethods05 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username : ");
		String username = sc.next();

		sc.nextLine();
		System.out.println("Ente Password : ");
		String password = sc.nextLine();

		if (username.equalsIgnoreCase("Admin123") && password.equals("Admin#$123")) {
			System.out.println("Successfully LoggedIn !! Welcome to Home Page " + username);
		} else {
			System.err.println("Invalid User Credentials !!");
		}

		sc.close();

	}
}
