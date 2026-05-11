package com.java8Features;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	public static void main(String[] args) {
		System.out.println("main metrhod sarted");

		BiConsumer<Integer, Integer> add = (a, b) -> System.out.println(a + b);

		add.accept(10, 20);

		System.out.println("-----------------");

		BiConsumer<String, Double> biCon = (name, sal) -> {
			System.out.println("Name   : " + name);
			System.out.println("Salary : " + sal);
		};

		biCon.accept("Lakshman ", 35000.00);
	}
}
