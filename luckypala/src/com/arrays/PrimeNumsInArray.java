package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumsInArray {
	static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter aa Array Size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter Array Elements with the size of : " + size);

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("prime nums Of given Array is : ");
		for (int n : arr) {
			if (isPrime(n)) {
				System.out.print(n + " ");
			}
		}

		sc.close();

	}
}
