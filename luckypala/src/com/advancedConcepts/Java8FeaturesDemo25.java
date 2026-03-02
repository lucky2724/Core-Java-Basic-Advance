package com.advancedConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FeaturesDemo25 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> nums = Arrays.asList(5, 4, 6, 7, 15, 3, 3, 4, 2, 7, 10);

		int min = nums.stream().min(Integer::compare).get();

		int max = nums.stream().max(Integer::compare).get();

		System.out.println("min number : " + min);
		System.out.println("max number : " + max);

		long count = nums.stream().count();
		System.out.println(count);

		long count1 = nums.stream().distinct().count();
		System.out.println(count1);

		System.out.println("----------------------------------");

		List<Integer> descOrder = nums.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0).distinct()
				.collect(Collectors.toList());

		System.out.println(descOrder);

		System.out.println("----------------------------------");

		Integer totalSum = nums.stream().filter(i -> i % 2 == 0).map(n -> n * 10).reduce(0, Integer::sum);
		System.out.println(totalSum);

	}
}
