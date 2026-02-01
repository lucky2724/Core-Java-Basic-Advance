package com.casestudy;

import java.util.Scanner;

public class Restaurant {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many food items you Ordered : ");
		int items = sc.nextInt();

		double total = 0;

		for (int i = 1; i <= items; i++) {
			System.out.println("Enter the price of item " + i + ":");
			double price = sc.nextDouble();
			total += price;
		}

		double avg = total / items;

		System.out.println("===== Bill Summary =====");
		System.out.println("Total Bill amount : " + total);
		System.out.println("Average price per Item : " + avg);

		sc.close();

	}
}
