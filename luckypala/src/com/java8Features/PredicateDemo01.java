package com.java8Features;

import java.util.function.Predicate;

public class PredicateDemo01 {
	public static void main(String[] args) {
		System.out.println("main method started !!");

		// WAP given number is even or not
		Predicate<Integer> p1 = i -> i % 2 == 0;

		System.out.println(p1.test(4));
		System.out.println(p1.test(5));
		System.out.println(p1.test(17));

		System.out.println("--------------------");

		// WAP given number is prime or not
		Predicate<Integer> isPrime = n -> {
			if (n <= 1) {
				return false;
			}

			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					return false;
				}
			}

			return true;
		};

		System.out.println(isPrime.test(5));
		System.out.println(isPrime.test(15));

		System.out.println("--------------------");

		Predicate<String> p3 = s -> s.contains("Java");
		
		System.out.println(p3.test("Srikanth Java"));
		System.out.println(p3.test("Lucky"));

	}
}
