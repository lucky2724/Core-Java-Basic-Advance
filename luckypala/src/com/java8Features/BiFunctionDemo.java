package com.java8Features;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		System.out.println(add.apply(10, 20));

		BiFunction<String, String, Integer> biFun = (s1, s2) -> s1.concat(s2).length();

		System.out.println(biFun.apply("Lucky", "Java"));
	}
}
