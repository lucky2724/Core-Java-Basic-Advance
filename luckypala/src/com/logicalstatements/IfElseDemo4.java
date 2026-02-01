package com.logicalstatements;

import java.util.Scanner;

public class IfElseDemo4 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();

		if (marks > 75) {
			System.out.println("Welcome to TCS");
			System.out.println("Congratulations You are eligible for Interview");
		}else
			System.out.println("Sorry for Inconvinance, You can leave for the day");
			System.out.println("All the best..");
				

		System.out.println("main method ended");

		sc.close();

	}
}
