package com.tasksLogicalStatements;

public class GCDandLCMEuclidian {
	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		int n1 = 40;
		int n2 = 20;

		int gcd = gcd(n1, n2);
		int lcm = (n1 * n2) / gcd;

		System.out.println("GCD : " + gcd);
		System.out.println("LCM : " + lcm);
	}
}
