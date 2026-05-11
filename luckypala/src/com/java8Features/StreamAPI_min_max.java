package com.java8Features;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_min_max {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		List<Integer> list =
		        Arrays.asList(10,40,20,5);

		int min =
		        list.stream()
		            .min(Integer::compare)
		            .get();

		int max =
		        list.stream()
		            .max(Integer::compare)
		            .get();

		System.out.println("Min : "+min);
		System.out.println("Max : "+max);
	}
}
