package com.casestudy;

public class CountTheFrequency {
	public static void main(String[] args) {
		System.out.println("main method startedd..");

		int arr[] = { 1, 2, 2, 3, 1,4,5,5,4,4,4 };

		boolean visited[] = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			if (visited[i]) {
				continue;
			}
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			
			System.out.println(arr[i]+" -> "+count+" times");
		}

	}
}
