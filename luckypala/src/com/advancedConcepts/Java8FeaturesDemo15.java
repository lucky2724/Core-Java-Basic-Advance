package com.advancedConcepts;

import java.util.function.Consumer;

public class Java8FeaturesDemo15 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Consumer<Integer> c1 = i -> System.out.println(i * 10);

		c1.accept(67);

		System.out.println("----------------");

		Consumer<String> c2 = s -> {
			System.out.println(s.toLowerCase());
			System.out.println(s.toUpperCase());
			System.out.println(s.length());
		};

		c2.accept("Java is Simple");

	}
}
