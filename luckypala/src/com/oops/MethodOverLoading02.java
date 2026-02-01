package com.oops;

public class MethodOverLoading02 {
	void addition() {
		System.out.println("Addition method with no-args called !!");
	}

	void addition(char c) {
		System.out.println("Addition method with 1-char-args called !!  " + c);
	}
	void addition(int a) {
		System.out.println("Addition method with 1-int-args called !!  " + a);

	}

	void addition(int a, int b) {
		System.out.println("Addition method with 2-int-args called !!  " + a + "," + b);
	}

	void addition(float a) {
		System.out.println("Addition method with 1-float args called !!  " + a);
	}

	void main(String[] args) {
		System.out.println("main method started !!");

		addition('A');
		addition(10);
		addition(10.4f);
		addition(10);
		addition(100, 200);
	}
}
