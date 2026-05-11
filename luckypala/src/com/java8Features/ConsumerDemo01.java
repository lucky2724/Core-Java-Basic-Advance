package com.java8Features;

import java.util.function.Consumer;

public class ConsumerDemo01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Consumer<Integer> c1 = i -> System.out.println(i * 10);
		c1.accept(5);

		Consumer<String> c2 = s -> {
			System.out.println("Welcome " + s + " !!!");
			System.out.println(s.toUpperCase());
			System.out.println(s.length());
		};
		c2.accept("Lucky");
	}
}
