package com.advancedConcepts;

import java.util.function.Function;

//Function chaining
public class Java8FeaturesDemo14 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Function<Integer, Integer> f1 = i -> 2 * i;

		Function<Integer, Integer> f2 = i -> i * i * i;

		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));

	}
}
