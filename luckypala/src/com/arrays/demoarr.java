package com.arrays;

public class demoarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 6, 5, -3, 8};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		System.out.println(sum);
	}

}
