package com.operators;

public class Ternary_Operators {
	public static void main(String[] args) {
		System.out.println("main method started..");

		// even odd
		int n = 2230;
		String ans = (n % 2 == 0) ? "Even" : "Odd";
		System.out.println(n + " is " + ans);

		// Biggest Of two nums
		int a = 204;
		int b = 867;
		int res = (a > b) ? a : b;
		System.out.println(res + " is big");

		// Eligible for vote or not
		int age = 19;
		String status = (age >= 18) ? "Eligble for Vote" : "Not Eligible";
		System.out.println(status);

		// Eliggible for marriage or not
		int age1 = 20;
		String isEligible = (age1 >= 21) ? "Elegible for marriage" : "Not Eligible";
		System.out.println(isEligible);

		// Biggest of three nums
		int x = 1909;
		int y = 330;
		int z = 3099;

		int sol = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
		System.out.println(sol + " is large Number");
	}
}
