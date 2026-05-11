package com.java8Features;

import java.util.function.Predicate;

public class PredicateDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Predicate<String> p1 = s -> s.length() > 5;

		String[] arr = { "Virat", "Hardik", "Rohit", "Abhishek", "Nitish" };

		for (String name : arr) {
			if (p1.test(name)) {
				System.out.println(name);
			}
		}

	}
}
