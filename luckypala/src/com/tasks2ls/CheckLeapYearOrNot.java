package com.tasks2ls;

import java.util.Scanner;

public class CheckLeapYearOrNot {
	public static void main(String[] args) {
		System.out.println("main method started !!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Year : ");
		int year = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a Leap Year !!");
		} else {
			System.out.println(year + " is Not a Leap Year");
		}

		sc.close();
	}
}
