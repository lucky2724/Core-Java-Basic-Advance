package com.arrays;

public class LongestWordInArray {
	public static void main(String[] args) {
		System.out.println("main method started..");

		String[] arr = { "java", "is", "simple", "when", "you", "practice", "daily" };

		String longest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() > longest.length()) {
				longest = arr[i];
			}
		}
		System.out.println(longest);
	}
}

