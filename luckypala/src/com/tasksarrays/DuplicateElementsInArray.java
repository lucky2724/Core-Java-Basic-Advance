package com.tasksarrays;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 3, 2, 4, 1, 8, 7, 1, 2, 3, 2, 22 };

		boolean visited[] = new boolean[arr.length];

		System.out.println("Duplicate elements:");

		for (int i = 0; i < arr.length; i++) {
			if (visited[i])
				continue;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i]+"  ");
					visited[j] = true;
					break;
				}
			}
		}
	}
}
