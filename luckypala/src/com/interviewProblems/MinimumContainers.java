package com.interviewProblems;

import java.util.Arrays;

public class MinimumContainers {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int packages[] = { 2, 3, 4, 5, 6 };
		int capacity = 10;

		Arrays.sort(packages);

		int i = 0;
		int j = packages.length - 1;
		int containers = 0;

		while (i <= j) {
			if (packages[i] + packages[j] <= capacity) {
				i++;
				j--;
			} else {
				j--;
			}
			containers++;
		}

		System.out.println("Minimum Containers required : " + containers);
	}
}
