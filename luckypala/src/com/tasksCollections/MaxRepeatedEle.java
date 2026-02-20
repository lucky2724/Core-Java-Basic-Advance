package com.tasksCollections;

import java.util.ArrayList;
import java.util.List;

public class MaxRepeatedEle {
	public static void main(String[] args) {
		System.out.println("main method started");

		Integer[] arr = { 1, 2, 4, 3, 1, 1, 3, 2, 1, 1, 1 };

		List<Integer> li = new ArrayList<>(List.of(arr));

		for (int i = 0; i < li.size(); i++) {

			int count = 0;

			for (int j = 0; j < li.size(); j++) {

				if (li.get(i).equals(li.get(j))) {
					count++;
				}
			}

			if (count > li.size() / 2) {
				System.out.println("Majority Element: " + li.get(i));
				break;
			}
		}
	}
}
