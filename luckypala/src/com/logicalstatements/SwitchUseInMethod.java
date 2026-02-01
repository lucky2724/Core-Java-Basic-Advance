package com.logicalstatements;

import java.util.Scanner;

public class SwitchUseInMethod {

	static String dayDiscription(int day) {
		return switch (day) {
		case 1 -> "Monday Shivayyaaaaaa !!!";
		case 2 -> "Tuesday  Jai Hanuman !!";
		case 3, 4, 5 -> "Wednesday , thursday,frday ..Let's Break !!";
		case 6 -> "Saturday  No Non-veg Guys Relax 😁";
		case 7 -> "Sunday --> Funday 🍻🍟🍔";
		default -> "Invalid Day !!";
		};

	}

	public static void main(String[] args) {
		System.out.println("main method started.");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a day : ");
		int day = sc.nextInt();

		System.out.println(dayDiscription(day));
		
		sc.close();
	}
}
