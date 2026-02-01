package com.tasks2ls;

import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ===== Fizz Buzz Game =====");

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("Fizz Buzz !!");
		} else if (n % 3 == 0) {
			System.out.println("Fizz");
		} else if (n % 5 == 0) {
			System.out.println("Buzz");
		} else {
			System.out.println(n);
		}

		sc.close();
	}
}
