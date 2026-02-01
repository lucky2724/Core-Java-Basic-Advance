package com.tasksarrays;

public class FrequencyCount02 {
	public static void main(String[] args) {
		System.out.println("main methos started..");

		int arr[] = { 1, 3, 1, 2, 5, 2, 7 };

		int count = 0;

		boolean visit[] = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visit[i]) {
				continue;

			}
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visit[j] = true;
				}
			}
			System.out.println(arr[i] + " -> " + count);
			if (count > 1) {
				System.out.println(arr[i]);
			}
			count = 0;
		}

		// System.out.println(Arrays.toString(visit));o

	}
}
