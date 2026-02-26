package com.advancedConcepts;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class Java8FeaturesDemo20 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("main method started");

		BiConsumer<String, Double> bic = (s, d) -> {
			System.out.println("Emplyee name : " + s);
			System.out.println("Employee sal : " + d);
		};

		System.out.println("Enter Your name : ");
		String name = sc.nextLine();
		System.out.println("Enter Your Salary : ");
		double sal = sc.nextDouble();
		bic.accept(name, sal);
		
		sc.close();

	}
}
