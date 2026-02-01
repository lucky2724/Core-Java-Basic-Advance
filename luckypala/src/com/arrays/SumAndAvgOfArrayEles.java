package com.arrays;

public class SumAndAvgOfArrayEles {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int marks[] = { 65, 64, 63, 62, 61, 54 };

		// System.out.println(numbers.length);

		int sum = 0;

		for (int n : marks) {
			sum += n;
		}

		double avg = sum / marks.length;

		System.out.println("Total marks : " + sum);
		System.out.println("Avg marks per subject : " + avg);
	}
}
