package com.tasksarrays;

public class UniqueElesArrray {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int arr[] = { 1, 2, 4, 2, 1, 2, 3, 2, 1, 3, 5, 3, 9, 0 };

		boolean visit[] = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visit[i]) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					// System.out.print(arr[i] + " ");
					visit[i] = true;
				}
			}
			if (!visit[i]) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
