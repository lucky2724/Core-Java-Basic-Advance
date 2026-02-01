package com.tasks2ls;

import java.util.Scanner;

public class SimpleCalculatorUsingSwitchCase {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a first Number :");
		int a = sc.nextInt();

		System.out.println("Enter a second Number : ");
		int b = sc.nextInt();

		System.out.println("======= Simple Calculator =======");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulas");

		System.out.println("Enter operation (1-4) : ");
		int operation = sc.nextInt();

		int result = 0;

		switch (operation) {
			case 1 -> result = a + b;
			case 2 -> result = a - b;
			case 3 -> result = a * b;
			case 4 -> result = a / b;
			case 5 -> result = a % b;
			default -> System.out.println("Inavalid Operation !!!");

		}

		if (operation<=5) {
			System.out.println("Result : " + result);
		}

		sc.close();
	}
}
