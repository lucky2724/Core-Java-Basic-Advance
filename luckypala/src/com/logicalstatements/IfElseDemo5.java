package com.logicalstatements;

import java.util.Scanner;

//WATP to get a job in 4 to 5 monthsto IT job Elgiblity check?
public class IfElseDemo5 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Are you regular for classes & daily Assignments ?");
		boolean areYouRegular = sc.nextBoolean();

		System.out.println("Are you Practicing Daily 4Hrs + ?");
		boolean areYouPracticing = sc.nextBoolean();

		System.out.println("Are you attending weekly tests ?");
		boolean areYouAttendingWeeklyTest = sc.nextBoolean();

		System.out.println("Are you attending the mocks ?");
		boolean areYouAttendingMocks = sc.nextBoolean();

		if (areYouRegular && areYouPracticing && areYouAttendingWeeklyTest && areYouAttendingMocks) {
			System.out.println("Yo will Get a Job  in 5 to 6 months");
		} else {
			System.out.println("Sorry ! You will get a job in next 2027");
		}

		sc.close();

	}
}
