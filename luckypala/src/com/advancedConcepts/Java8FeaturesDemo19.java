package com.advancedConcepts;

import java.util.function.BiFunction;

public class Java8FeaturesDemo19 {
	public static void main(String[] args) {
		System.out.println("main method started");

		BiFunction<String, String, String> bif = (s1, s2) -> s1.concat(s2);

		System.out.println(bif.apply("Lucky", " Pala"));
		System.out.println(bif.apply("Siri", " Nimmakayala"));

		BiFunction<String, String, Integer> bif2 = (s1, s2) -> s1.concat(s2).length();
		System.out.println(bif2.apply("Lucky", " Pala"));

	}
}
