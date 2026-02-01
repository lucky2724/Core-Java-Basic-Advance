package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayValuesFromScanner {
	public static void main(String[] args) {
		System.out.println("main method started..");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Array Size..");
		int size = sc.nextInt();

		int arr[] = new int[size];
		
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < size; i++) {
			System.out.println("Eneter Array Element at " + i + " index : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Your Array  is  : ");
		System.out.println(Arrays.toString(arr));

		sc.close();
	}
}
