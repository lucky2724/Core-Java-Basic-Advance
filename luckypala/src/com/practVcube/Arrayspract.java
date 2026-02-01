package com.practVcube;

import java.util.Arrays;

public class Arrayspract {
	public static void main(String[] args) {
		System.out.println("main method started..");
		int arr[] = { 1, 2, 3, 4 };
		
		System.out.println(Arrays.toString(arr));
		
		int l=0;
		int r=arr.length-1;
		
		while(l<r) {
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			
			l++;
			r--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
