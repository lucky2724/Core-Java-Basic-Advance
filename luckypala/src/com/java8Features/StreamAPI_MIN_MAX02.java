package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_MIN_MAX02 {
	public static void main(String[] args) {
		System.out.println("main method started");

		List<Integer> list = Arrays.asList(10, 36, 87, 22, 3, 9, 16, 34);
		
		int min=list.stream()
					.min(Integer::compare)
					.get();
		
		int max=list.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println("min : "+min);
		System.out.println("max : "+max);

	}
}
