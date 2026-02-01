package com.tasksarrays;

import java.util.Scanner;

public class CountEleInArray {
	static int countEle(int arr[], int ele) {
		int count = 0;

		for (int i : arr) {
			while (i > 0) {
				int digit = i % 10;
				i /= 10;

				if (digit == ele) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println("main method started.");

		Scanner sc = new Scanner(System.in);

		int arr[] = { 122, 342, 543, 212, 222 };

		System.out.println("Eneter a number whart do you want ..!");
		int ele = sc.nextInt();

		System.out.println(countEle(arr, ele));

		sc.close();

	}
}
