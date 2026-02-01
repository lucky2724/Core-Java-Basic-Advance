package com.logicalstatements;

import java.util.Scanner;

public class ElseIfDemo2 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if (age < 0) {
			System.out.println("Invalid Age !!");
		} else if (age >= 60) {
			System.out.println("You are a Senior citizen");
		} else if (age >= 35) {
			System.out.println("You are a Middle aged person");
		} else if (age >= 20) {
			System.out.println("You are young");
		} else if (age >= 13) {
			System.out.println("You are a teenager");
		} else if (age >= 5) {
			System.out.println("You are children");
		} else {
			System.out.println("You are a kid");
		}

		sc.close();
	}
}
