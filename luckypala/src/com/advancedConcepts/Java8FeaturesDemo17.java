package com.advancedConcepts;

import java.util.function.Predicate;

public class Java8FeaturesDemo17 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Predicate<Integer> p1 = n -> n % 2 == 0;

		Predicate<Integer> p2 = n -> n % 2 == 4;

		Predicate<Integer> p3 = p2.and(p1);
		System.out.println(p3.test(8));

		Predicate<Integer> p4 = p2.or(p1);
		System.out.println(p4.test(8));

		Predicate<Integer> p5 = p1.negate();
		System.out.println(p5.test(8));

	}
}
