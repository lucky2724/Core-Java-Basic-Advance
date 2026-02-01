package com.tasksarrays;

public class ContainerWithMostWaterOptimal {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		int l = 0;
		int r = arr.length - 1;

		int max = Integer.MIN_VALUE;

		while (l < r) {
			int area = (r - l) * Math.min(arr[l], arr[r]);

			max = Math.max(max, area);
			
			if (arr[l] > arr[r]) {
				r--;
			} else {
				l++;
			}
		}
		
		System.out.println("max container with water : "+max);
	}
}
