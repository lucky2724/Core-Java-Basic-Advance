package com.tasksCollections;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElementsArrayList {
	public static void main(String[] args) {

		System.out.println("main method started");

		Integer[] arr = { 1, 2, 1, 3, 3, 4, 6, 2, 3, 3 };

		List<Integer> li = new ArrayList<>(List.of(arr));

		boolean[] visited = new boolean[li.size()];

		System.out.println("Duplicates : ");

		for (int i = 0; i < li.size(); i++) {

			if (visited[i])
				continue;

			boolean isDuplicate = false;

			for (int j = i + 1; j < li.size(); j++) {

				if (li.get(i).equals(li.get(j))) {
					visited[j] = true;
					isDuplicate = true;
				}
			}

			if (isDuplicate) {
				System.out.print(li.get(i) + " ");
				visited[i] = true;
			}
		}
	}
}

//boolean visited[] = new boolean[arr.length];
//
//System.out.println("Duplicate elements:");
//
//for (int i = 0; i < arr.length; i++) {
//	if (visited[i])
//		continue;
//
//	for (int j = i + 1; j < arr.length; j++) {
//		if (arr[i] == arr[j]) {
//			System.out.print(arr[i]+"  ");
//			visited[j] = true;F
//			break;
//		}
//	}
//}
