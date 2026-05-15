package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<String> sentences = Arrays.asList("Hello World", "Java is SImple");
		
		List<String>words=sentences.stream()
									.flatMap(sentence -> Arrays.stream(sentence.split(" ")))
									.collect(Collectors.toList());
		
		System.out.println(words);
	}
}
