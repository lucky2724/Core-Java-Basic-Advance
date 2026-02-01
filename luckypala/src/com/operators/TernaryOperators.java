package com.operators;

public class TernaryOperators {
	public static void main(String[] args) {
		System.out.println("main method started..");
		// Ternary ==> It is similar to if-else Condition
		int a1 = 100;

		String result = (a1 > 50) ? "Yes" : "No";
		System.out.println(result);

		int i = 10;
		String msg = (i > 30) ? "Yes" : "No";
		System.out.println(msg);

		int a = 110;
		int b = 210;

		int ans = (a > b) ? a : b;
		System.out.println(ans + " is big.");

		int x = 112;
		int y = 433;
		int z = 324;

		int max = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
		System.out.println(max + " is biggest among three numbers");

		String s1 = "Luckyy";
		String s2 = "Java";

		String bigStr = (s1.length() > s2.length()) ? s1 : s2;
		System.out.println("Big String is : " + bigStr);

	}
}
