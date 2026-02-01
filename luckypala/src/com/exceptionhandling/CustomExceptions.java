package com.exceptionhandling;

import java.util.Scanner;

@SuppressWarnings("serial")
class LuckyException extends Exception {
	LuckyException(String s) {
		super(s);
	}
}

public class CustomExceptions {
	public static void main(String[] args) throws LuckyException {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter Your age : ");
			int age = sc.nextInt();

			if (age < 18) {
				throw new LuckyException("Chinna Pillodivi raa Nuv !!! ");
			} else {
				System.out.println("You are Eligble for Driving !!");
			}
		} finally {
			sc.close();
		}

	}
}
