package com.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI_collect {
	public static void main(String[] args) {
		System.out.println("main method started");
		
		List<Integer> list =
                Arrays.asList(10,15,20,25);

        List<Integer> even =
                list.stream()
                    .filter(n -> n%2==0)
                    .collect(Collectors.toList());

        System.out.println(even);
	}
}
