package com.advancedConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FeaturesDemo24 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Double> list = Arrays.asList(40000.00, 50000.00, 60000.00, 70000.00, 20000.00, 150000.00);

		List<Double> ans = list.stream().map(i -> i + 5000).sorted().collect(Collectors.toList());

		System.out.println(ans);
		ans.forEach(System.out::println);

	}
}
