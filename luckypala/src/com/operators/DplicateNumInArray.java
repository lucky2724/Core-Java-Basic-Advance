package com.operators;

public class DplicateNumInArray {
	public static void main(String[] args) {
		System.out.println("main method started..");
		int arr[]= {1,2,3,1,2,4,4,5,3};
		int result=0;
		
		for(int i=0;i<arr.length;i++) {
			result^=arr[i];
		}
		System.out.println(result);
	}
}
