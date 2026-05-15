package com.java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingStream {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> list = Arrays.asList(10,36, 87, 22, 3, 9, 16, 34);
		
		System.out.println(list);
		
		List<Integer> ascList=list.stream()
				.sorted()
				.collect(Collectors.toList());

		
		List<Integer> descList=list.stream()
								.sorted((a,b)->b-a)
								.collect(Collectors.toList());
		
		List<Integer> descLis2t=list.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(ascList);
		System.out.println(descList);
		System.out.println(descLis2t);

	}
}
