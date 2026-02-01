package com.practVcube;

import java.util.Scanner;

public class ExceptionHandling03 {
	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("You are not eligible to register!!");
		} else {
			System.out.println("You are register Sucessfullyy!!");
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		checkAge(age);

		sc.close();
	}
}
