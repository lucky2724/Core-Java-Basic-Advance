package com.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(15);
		list.add(52);
		list.add(76);
		list.add(67);
		list.add(34);
		list.add(23);
		list.add(18);
		list.add(89);
		list.add(50);
		list.add(44);
		list.add(0);

		// way 1
		Stream<Integer> str = list.stream();
		Stream<Integer> str1 = str.filter(i -> i % 2 == 0);
		List<Integer> evenList = str1.collect(Collectors.toList());

		System.out.println(evenList);

		// way 2
		List<Integer> oddList = list.stream()
				.filter(n -> n % 2 != 0)
				.collect(Collectors.toList());
		
		System.out.println(oddList);
		
		// way 3
		list.stream()
			.filter(n -> n % 2 == 0)
			.forEach(System.out::println);
	}
}
