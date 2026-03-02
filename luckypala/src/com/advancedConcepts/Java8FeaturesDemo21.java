package com.advancedConcepts;

import java.util.ArrayList;
import java.util.Arrays;
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

		System.out.println("-----------------------");

		int[] arr1 = { 1, 2, 3, 4, 5 };

		int sum1 = Arrays.stream(arr1).sum();
		int max1 = Arrays.stream(arr1).max().getAsInt();

		System.out.println("Sum of Array Elements : " + sum1);
		System.out.println("Maximum of Array : " + max1);

		System.out.println("-----------------------");

		int[] arr = { 10, 20, 30, 40, 50 };

		// Sum
		int sum = Arrays.stream(arr).sum();

		// Maximum
		int max = Arrays.stream(arr).max().getAsInt();

		// Minimum
		int min = Arrays.stream(arr).min().getAsInt();

		// Average
		double avg = Arrays.stream(arr).average().getAsDouble();

		// Print results
		System.out.println("Sum      : " + sum);
		System.out.println("Maximum  : " + max);
		System.out.println("Minimum  : " + min);
		System.out.println("Average  : " + avg);

		System.out.println("-----------------------");

		int[] a = { 1, 2, 3, 2, 1, 3, 3, 4, 5, 6, 4, 32, 1 };

		Arrays.stream(a).distinct().forEach(System.out::println);

		System.out.println("-----------------------");

		List<Integer> ans = Arrays.stream(a).boxed().sorted().collect(Collectors.toList());

		System.out.println(ans);

		Arrays.stream(a).sorted().forEach(System.out::println);
	}
}
