package com.advancedConcepts;

import java.util.function.Predicate;

public class Java8FeaturesDemo11 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Predicate<Integer> p1 = (i) -> i % 2 == 0;

		System.out.println(p1.test(5));
		System.out.println(p1.test(10));

		System.out.println("-------------");

		Predicate<String> p2 = (s) -> s.toLowerCase().contains("java");
		System.out.println(p2.test("Java"));
		System.out.println(p2.test("Luckyy jav"));

		System.out.println("-------------");

		Predicate<Double> p3 = (sal) -> sal > 1000.00;
		System.out.println(p3.test(939.5));
		System.out.println(p3.test(1435.69));

		System.out.println("-------------");

		Predicate<String> p4 = (s) -> s.length() > 5;

		String[] names = { "virat", "baabu", "MSD", "Ishan", "Hardhik", "Rishab Panth" };

		for (String name : names) {
			if (p4.test(name)) {
				System.out.println(name);
			}
		}

	}
}
