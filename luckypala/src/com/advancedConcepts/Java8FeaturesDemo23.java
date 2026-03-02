package com.advancedConcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Java8FeaturesDemo23 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello", "Haii", "Bye", "Joy", "Hurray");

		List<String> ans = list.stream().filter(s -> s.startsWith("H")).collect(Collectors.toList());

		System.out.println(ans);

		ans.forEach(System.out::println);// or

		System.out.println("-----------------");

		Consumer<String> c1 = s -> {
			System.out.println(s);
		};

		ans.forEach(c1);

	}
}
