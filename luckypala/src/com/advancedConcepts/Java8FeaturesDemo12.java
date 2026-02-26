package com.advancedConcepts;

import java.util.function.Function;

public class Java8FeaturesDemo12 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Function<Integer, Integer> f1 = (i) -> i * i;
		System.out.println(f1.apply(9));

		Function<String, Integer> f2 = (s) -> s.length();
		System.out.println(f2.apply("Srikanth Java"));

		Function<String, String> f3 = (s) -> s.toUpperCase();
		System.out.println(f3.apply("Srikanth Java"));
		
		
	}
}
