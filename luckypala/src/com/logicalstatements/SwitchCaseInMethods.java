package com.logicalstatements;

import java.util.Scanner;

public class SwitchCaseInMethods {
	static String getDayDiscription(int day) {
		return switch (day) {
		case 1 -> "Sunday is Holiday !!";
		case 2 -> "Monday is Lazyyy !!";
		case 3, 4, 5 -> "Tuesday,Wednesday,Thursday Boring !!";
		case 6 -> "Friday is Week-Off !!";
		case 7 -> "Saturday is Devotional Day !!";
		default -> "Invalid Day !!";
		};
	}

	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a day :");
		int day = sc.nextInt();

		System.out.println(getDayDiscription(day));

		
		sc.close();
	}
}
