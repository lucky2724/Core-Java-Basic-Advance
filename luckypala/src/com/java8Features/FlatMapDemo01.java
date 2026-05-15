package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo01 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("a","b"),
				Arrays.asList("c","d"),
				Arrays.asList("e")
				);
		
		
		nestedList.stream()
			.flatMap(List::stream)
			.forEach(System.out::println);
	}
}
