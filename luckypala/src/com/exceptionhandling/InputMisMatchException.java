package com.exceptionhandling;

import java.util.Scanner;

import java.util.*;

public class InputMisMatchException {
	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		int age = 0;

		boolean valid = false;

		while (!valid) {
			try {
				System.out.println("Enter Your age : ");
				age = sc.nextInt();
				valid = true;

			} catch (InputMismatchException e) {
				System.err.println("Input Mismatch..Please try again... ");
				sc.next();
			}
		}

		if (age > 0 && age <= 99) {
			System.out.println("Your Entered Age : " + age);
		} else {
			System.out.println("Invalid Age !!");
		}

		sc.close();
	}
}
