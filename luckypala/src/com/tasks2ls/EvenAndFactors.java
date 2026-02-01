package com.tasks2ls;

public class EvenAndFactors {
	static void evenAndFactors() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && 60 % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");
		evenAndFactors();

	}
}
