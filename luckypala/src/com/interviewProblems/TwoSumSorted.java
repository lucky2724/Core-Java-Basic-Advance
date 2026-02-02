package com.interviewProblems;

import java.util.Arrays;

public class TwoSumSorted {
	static int[] twoSum(int arr[], int target) {
		int l = 0;
		int r = arr.length - 1;

		int idx[] = new int[2];
		int ans[] = new int[2];

		while (l < r) {
			int sum = arr[l] + arr[r];

			if (sum == target) {
				ans[0] = arr[l];
				ans[1] = arr[r];

				idx[0] = l;
				idx[1] = r;
				break;
			} else if (sum > target) {
				r--;
			} else {
				l++;
			}
		}

		System.out.println("Indexes : " + Arrays.toString(idx));
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 2, 11, 7, 15, };
		int target = 9;

		int ans[] = twoSum(arr, target);
		System.out.println(Arrays.toString(ans));
	}
}
