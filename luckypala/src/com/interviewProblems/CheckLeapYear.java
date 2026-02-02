package com.interviewProblems;

public class CheckLeapYear {
	public static void main(String[] args) {
		System.out.println("main method started");

		int year = 2025;

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a Leap year");
		} else {
			System.out.println(year + " is not a Leap year");
		}
	}
}
