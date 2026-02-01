package com.logicalstatements;

import java.util.Scanner;

public class IfElseDemo3 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Are you Indian : ");
		boolean statusCheck=sc.nextBoolean();

		if (age > 18 && statusCheck) {
			System.out.println("Congratulations !!");
			System.out.println("You are Eligible for Voting");
		} else {
			System.out.println("BadLuck !!");
			System.out.println("Neeku inka time undhi raa..");
		}

		sc.close();
	}
}
