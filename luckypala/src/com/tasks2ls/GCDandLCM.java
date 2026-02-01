package com.tasks2ls;

public class GCDandLCM {
	public static void main(String[] args) {
		int n1 = 40;
		int n2 = 20;

		int min = Math.min(n1, n2);

		int gcd = 1;

		for (int i = min; i >= 1; i--) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
				break;
			}
		}

		System.out.println("GCD Of " + n1 + " and " + n2 + " is : " + gcd);

		int lcm = (n1 * n2) / gcd;

		System.out.println("LCM Of " + n1 + " and " + n2 + " is : " + lcm);
	}

}
