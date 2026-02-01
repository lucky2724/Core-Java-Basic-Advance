package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class practice03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age = 0;
		boolean valid = false;

		while (!valid) {
			try {
				System.out.print("Enter your age: ");
				age = sc.nextInt();
				valid = true;
			} catch (InputMismatchException e) {
				System.out.println("❌ Invalid input! Please enter a number.");
				//e.printStackTrace();
				sc.next();
			}
		}

		System.out.println("Your age is: " + age);
		sc.close();

	}
}
