package com.interviewProblems;

import java.util.HashMap;

public class MajorityEleMorethanNby2 {
	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 3, 3, 4, 2, 3, 3, 5 };

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int num : arr) {
			hm.put(num, hm.getOrDefault(num, 0) + 1);
		}

		System.out.println(hm);

		for (int n : hm.keySet()) {
			if (hm.get(n) > arr.length / 2) {
				System.out.println(n);
			}
		}

	}
}
