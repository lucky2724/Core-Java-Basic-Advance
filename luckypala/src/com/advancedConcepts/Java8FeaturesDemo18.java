package com.advancedConcepts;

import java.util.function.BiPredicate;

public class Java8FeaturesDemo18 {
	public static void main(String[] args) {
		System.out.println("main method started");

		BiPredicate<Integer, Integer> bip = (i1, i2) -> i1 * i2 % 2 == 0;

		System.out.println(bip.test(5, 5));

		BiPredicate<String, String> bip2 = (s1, s2) -> s1.length() == s2.length();
		System.out.println(bip2.test("Durga", "Lucky"));

		BiPredicate<String, String> bip3 = (s1, s2) -> s1.concat(s2).length() > 15;

		String fname = "Lakshman";
		String lname = "Pala";

		if (bip3.test(fname, lname)) {
			System.out.println("Your name too lengthy !!!");
		} else {
			System.out.println("good to go " + fname.concat(lname));

		}

	}
}
