package com.practVcube;

public class ExceptionHandling04 {
	public static void main(String[] args) {
		System.out.println("main method started..");

		try {
			int arr[] = { 1, 2, 3 };
			System.out.println(arr[4]);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds exception !!!");
		} finally {
			System.out.println("Finally Block  is always execute!!");
		}
	}
}
