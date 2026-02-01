package com.exceptionhandling;

import java.util.Arrays;

public class Errors {
	{
		System.out.println("Instace Block");
		@SuppressWarnings("unused")
		Errors e = new Errors();
		// StackOverFlowError
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		@SuppressWarnings("unused")
		Errors e = new Errors();

		System.out.println(Integer.MAX_VALUE);

		// OutOfMemoryError
		int[] arr = new int[2147483646];
		System.out.println(Arrays.toString(arr));

	}
}
