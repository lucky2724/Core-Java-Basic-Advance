package com.advancedConcepts;

import java.util.Scanner;

public class ExceptionDemo02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		

		if (age < 18) {
			throw new LuckyException("Lucky gaadu Oppukodu !!");
			// System.out.println("hii");
		} else {
			System.out.println("You are eligible to PROBLEMS !!!");
		}
		sc.close();

	}
}
