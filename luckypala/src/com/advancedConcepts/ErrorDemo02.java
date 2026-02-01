package com.advancedConcepts;

public class ErrorDemo02 {
	static ErrorDemo02 e2 = new ErrorDemo02();

	{
		// ErrorDemo02 e3 = new ErrorDemo02(); //stack overflow error
		System.out.println("Instance Block");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
	}
}
