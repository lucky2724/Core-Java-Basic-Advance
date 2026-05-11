package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> list = Arrays.asList(1,2,2, 2, 3, 4, 5, 6,6, 7, 8, 9, 10);

		List<Integer> evenList = list.stream()
									.filter(n -> n % 2 == 0)
									.sorted()
									.distinct()
									.collect(Collectors.toList());
		
		System.out.println(evenList);
	}
}
