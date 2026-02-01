package com.tasksarrays;

import java.util.HashMap;

public class FrequencyCount {
	public static void main(String[] args) {
		System.out.println("main method started");

		int arr[] = { 1, 3, 1, 2, 5, 2, 7 };

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}

		System.out.println(hm);

		for (int i : hm.keySet()) {
			if (hm.get(i) > 1) {
				System.out.println(i);
			}
		}
	}
}
