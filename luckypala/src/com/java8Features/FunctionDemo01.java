package com.java8Features;

import java.util.function.Function;

public class FunctionDemo01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Function<Integer, Integer> f1 = i -> i * i * i;
		System.out.println(f1.apply(5));

		Function<String, Integer> f2 = s -> s.length();
		System.out.println(f2.apply("Lucky Pala"));

		Function<String, String> f3 = (s) -> {
			return s.toUpperCase();
		};
		System.out.println(f3.apply("java is simple by srikanth Sir"));
	}
}
