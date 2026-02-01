package com.loopingstatements;

public class ForLoopEvenOdd {
	public static void main(String[] args) {
		System.out.println("main method started !!");
		// WAP to print even numbers 0 to 100
		System.out.println("Even Numbers : ");
		for (int i = 0; i <= 100; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("Odd Numbers : ");
		for (int i = 99; i >= 0; i -= 2) {
			System.out.print(i + " ");
		}
	}
}
