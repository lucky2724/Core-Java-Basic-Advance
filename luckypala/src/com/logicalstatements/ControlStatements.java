package com.logicalstatements;

public class ControlStatements {
	public static void main(String[] args) {
		System.out.println("main method startedd..");

		int a = 3;

		if (a > 5) {
			System.out.println("Hellooo");
		} else if (a == 5) {
			System.out.println("Jai Baabuu");
		} else {
			System.out.println("Bye prendsss !!");
		}

		switch (a) {
		case 1 -> System.out.println("One");
		case 2 -> System.out.println("two");
		case 3 -> System.out.println("three");
		default -> System.out.println("Nothing");
		}
	}
}
