package com.interviewProblems;

public class EvenAndOddSum {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int[] arr = { 1, 2, 3, 4, 5 };

		int evenSum = 0;
		int oddSum = 0;

		for (int num : arr) {
			if (num % 2 == 0) {
				evenSum += num;
			} else {
				oddSum += num;
			}
		}
		
		System.out.println("Even Sum : "+evenSum);
		System.out.println("Odd Sum : "+oddSum);
	}
}
