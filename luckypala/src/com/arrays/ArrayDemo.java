package com.arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		// Declaration
		int numbers[];

		// creation
		numbers = new int[5];

		// Initialization
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[4] = 50;
		numbers[3] = 40;

		// Representaion
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println();
		
		//for each loop
		for(int i:numbers) {
			System.out.print(i+" ");
		}
	}
}
