package com.java8Features;

import java.util.function.Predicate;

public class PredicateDemo03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Predicate<Integer> p1 = i1 -> i1 % 2 == 0;
		Predicate<Integer> p2 = i2 -> i2 % 3 == 0;

		Predicate<Integer> p3 = p1.and(p2);

		System.out.println(p3.test(30));// true
		System.out.println(p3.test(15));// false

		System.out.println("------------------");

		Predicate<Integer> p4 = p1.or(p2);
		System.out.println(p4.test(15));// true
		System.out.println(p4.test(30));// true

		System.out.println("------------------");

		Predicate<Integer> p5 = p1.negate();
		System.out.println(p5.test(15));

	}
}
