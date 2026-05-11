package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIDemo03 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<String> names = Arrays.asList("Dhoni", "Ishan", "Virat", "Rohit", "Rahul", "Abhishek", "Tilak");

		List<String> updatedNames = names.stream().
				filter(s -> s.contains("h")).sorted().collect(Collectors.toList());

		System.out.println(updatedNames);

		System.out.println("--------------");

		updatedNames.forEach(System.out::println);

	}
}
