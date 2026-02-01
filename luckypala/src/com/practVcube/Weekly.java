package com.practVcube;

public class Weekly {
	public static void main(String[] args) {
		System.out.println("main method started..");

		int[] arr1= {1,2,3};
		int[] arr2=arr1;
		arr2[0]=10;
		
		System.out.println(arr1[0]);

	}
}
