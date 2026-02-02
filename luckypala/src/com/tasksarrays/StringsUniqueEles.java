package com.tasksarrays;

public class StringsUniqueEles {
	public static void main(String[] args) {
		System.out.println("main method started");

		String[] arr = { "tommy", "johny", "tommy", "marry" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println(arr[j]);
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {

			}
			if (count == 0) {
				System.out.println(arr[i]);
			}
		}

	}
}
