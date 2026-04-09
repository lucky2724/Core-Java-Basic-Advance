package com.logicBuilding150;

public class AmicableNumbers {
	
	public static int amicable(int n) {
		int total = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				total += i;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");
		int n1 = 220;
		int n2 = 284;

		int sumN1 = amicable(n1);
		int sumN2 = amicable(n2);

		System.out.println("n1 : " + n1 + " and Sum is : " + sumN1);
		System.out.println("n2 : " + n2 + " and Sum is : " + sumN2);

		if (sumN1 == n2 && sumN2 == n1) {
			System.out.println("Amicable !! ");
		} else
			System.out.println("Not Amicable !!");

	}
}
