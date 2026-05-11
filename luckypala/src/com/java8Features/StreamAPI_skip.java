package com.java8Features;

import java.util.stream.Stream;

public class StreamAPI_skip {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Stream.of(1,2,3,4,5)
	      .skip(2)
	      .forEach(System.out::println);
	}
}
