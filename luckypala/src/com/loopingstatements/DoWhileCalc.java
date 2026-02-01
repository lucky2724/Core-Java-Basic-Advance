package com.loopingstatements;

import java.util.Scanner;

public class DoWhileCalc {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		String yn = "";

		do {

			System.out.println("Enter a number : ");
			int a = sc.nextInt();

			System.out.println("Enter b number : ");
			int b = sc.nextInt();

			System.out.println("Enter a Symbol to calculate numbers like this + - * / % ...");
			String sym = sc.next();

			switch (sym) {
			case "+" -> System.out.println("Addition : " + (a + b));
			case "-" -> System.out.println("Subtraction : " + (a - b));
			case "*" -> System.out.println("Multiplication : " + a * b);
			case "/" -> System.out.println("Division : " + a / b);
			case "%" -> System.out.println("Modulas : " + a % b);
			default -> System.out.println("Invalid symbol to proceed !!");

			}
			System.out.println("Doo You Want Proceed Further..?");
			System.out.println("Click Y for YES N for NO :");
			yn = sc.next();

			if (!yn.equalsIgnoreCase("y")) {
				System.out.println("Thanks for Using !!");
			}

		} while (yn.equalsIgnoreCase("y"));

		sc.close();
	}
}
