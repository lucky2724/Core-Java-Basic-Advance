package com.java8Features;

import java.util.Optional;

public class OptionalDemo01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		String name = null;

		// System.out.println(name.length()); // NullPointerException

		Optional<String> name1 = Optional.ofNullable(name);
		Optional<String> name2 = Optional.ofNullable("SRIKANTH");

		System.out.println(name1.isEmpty());
		System.out.println(name2);

		System.out.println("-------------------");

		System.out.println(name1.orElse("Un-Known"));// Un-Known
		System.out.println(name2.orElse("Un-Known"));// SRIKANTH
	}
}
