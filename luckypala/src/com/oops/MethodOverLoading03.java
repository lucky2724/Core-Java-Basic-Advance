package com.oops;

public class MethodOverLoading03 {

	void addition(int a, float b) {
		System.out.println("Addition method with 1-int & 1-float-args called !!  " + a + "," + b);
	}

//	void addition(int a, int b) {
//		System.out.println("Addition method with 2-int-args called !!  " + a + "," + b);
//	}

//	void addition(float a, int b) {
//		System.out.println("Addition method with 1-float & 1-int-args called !!  " + a + "," + b);
//	}

	void addition(float a, float b) {
		System.out.println("Addition method with 2-float-args called !!  " + a + "," + b);
	}

	void main(String[] args) {
		System.out.println("main method started..");

		addition(10, 20);
	}
}
