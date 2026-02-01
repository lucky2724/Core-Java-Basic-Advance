package com.tasksarrays;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 6 };

		int max = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int area = (j - i) * Math.min(arr[i], arr[j]);
				max = Math.max(max, area);
			}
		}
		System.out.println("max Container : "+max);
	}
}
