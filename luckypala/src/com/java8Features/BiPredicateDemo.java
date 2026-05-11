package com.java8Features;

import java.util.function.BiPredicate;

public class BiPredicateDemo {
	public static void main(String[] args) {
		BiPredicate<Integer, Integer> check = (a, b) -> (a + b) > 100;

		System.out.println(check.test(40, 30));
		System.out.println(check.test(70, 50));

		System.out.println("------------------");
		BiPredicate<Integer, Integer> p1 = (i1, i2) -> (i1 * i2) % 2 == 0;

		System.out.println(p1.test(10, 5));
		System.out.println(p1.test(3, 3));

		System.out.println("------------------");

		BiPredicate<String, String> p = (a, b) -> a.equalsIgnoreCase(b);
		System.out.println(p.test("Lucky", "LUCKY"));
	}
}
