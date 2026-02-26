package com.advancedConcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8FeaturesDemo21 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> l = new ArrayList<>();

		l.add(5);
		l.add(6);
		l.add(7);
		l.add(9);
		l.add(2);
		l.add(3);
		l.add(8);
		l.add(13);

		Stream<Integer> st = l.stream();
		Stream<Integer> st1 = st.filter(n -> n % 2 == 0);
		List<Integer> updatedList = st1.collect(Collectors.toList());

		System.out.println(updatedList);

		System.out.println("-----------------------");

		List<Integer> result = l.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println(result);

		System.out.println("-----------------------");

		l.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}
}
