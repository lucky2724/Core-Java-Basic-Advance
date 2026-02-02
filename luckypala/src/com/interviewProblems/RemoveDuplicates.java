package com.interviewProblems;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 1, 1, 25, 5, 4, 6, 5, 4 };

		LinkedHashSet<Integer> hs = new LinkedHashSet<>();

		for (int a : arr) {
			hs.add(a);
		}

		System.out.println(hs);

	}

}
