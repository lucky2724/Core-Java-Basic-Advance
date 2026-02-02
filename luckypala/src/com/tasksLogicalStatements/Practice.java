package com.tasksLogicalStatements;

public class Practice {
	public static void main(String[] args) {
		System.out.println("mmain method started");
		int n = 15;

		if (n % 3 == 0) {
			System.out.println("fizz");
		} else if (n % 5 == 0) {
			System.out.println("buzz");
		} else if (n % 3 == 0 && n % 5 == 0) {
			System.out.println("fizz buzz");
		} else {
			System.out.println(n);
		}
	}

}
