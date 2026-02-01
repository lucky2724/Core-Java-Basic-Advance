package com.logicalstatements;

import java.util.Scanner;

//WAAP get a tshirt size based on numbers
public class SwitchCaseDemo2 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your T-shirt size : ");
		int size = sc.nextInt();

		switch (size) {
		case 34 -> {
			System.out.println("Xtra Small-xs");
			System.out.println("price - 500/-");
		}
		case 36 -> System.out.println("Small-S");
		case 38 -> System.out.println("Medium-M");
		case 40 -> System.out.println("Large-L");
		case 42 -> System.out.println("Xtra Large-XL");
		default -> System.out.println("Size Unknown !! ");
		}

		sc.close();

	}
}
