package com.interviewProblems;

import java.util.LinkedHashSet;
import java.util.Set;

public class DeDuplicateArray {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 2, 2, 5, 4, 1, 5, 1, 9, 4, 1, 0 };

		Set<Integer> ls = new LinkedHashSet<>();

		for (int num : arr) {
			ls.add(num);
		}
		
		System.out.println(ls);
	}
}
