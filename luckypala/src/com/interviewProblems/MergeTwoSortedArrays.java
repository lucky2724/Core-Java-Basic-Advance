package com.interviewProblems;

import java.util.Arrays;

public class MergeTwoSortedArrays {
	public static void main(String[] args) {
		System.out.println("main metho started");

		int[] a = { 1, 3,5, 6, 7 };
		int[] b = { 2, 4,5, 6, 8 };

		int ans[] = new int[a.length + b.length];

		int idx = 0;

		for (int i = 0; i < a.length; i++) {
			ans[idx++] = a[i];
			ans[idx++] = b[i];
		}

		System.out.println(Arrays.toString(ans));

	}
}
