package com.java8Features;

import java.util.stream.Stream;

public class StreamAPI_limit {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		Stream.of(1,2,3,4,5,6)
	      .limit(3)
	      .forEach(System.out::println);
	}
}
