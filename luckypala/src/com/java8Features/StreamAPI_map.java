package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_map {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> list = Arrays.asList(1, 2, 3, 4,5,6,7,8,9,10);

		list.stream()
			.filter(n -> n % 2 == 0)
			.map(n -> n * n)
			.forEach(System.out::println);
	}
}
