package com.oops;

public class CalculateAreas {
	void getArea(double d) {
		System.out.println("Area Of Circle : " + 3.14 * d * d);
	}

	void getArea(float f, double d) {
		System.out.println("Area Of Triangle : " + 0.5 * d * f);
	}

	void getArea(double d1, double d2) {
		System.out.println("Area Of Rectangle : " + d1 * d2);
	}

	void getArea(float f) {
		System.out.println("Area Of Square : " + f * f);
	}

	public void main(String[] args) {
		System.out.println("main method started..");
		getArea(10.4);
		getArea(2.5f, 9.5);
		getArea(10.5, 10);
		getArea(7.5f);

		System.out.println("**************");
		getArea(10.4);
		getArea(2.5, 9.5);
		getArea(10.5, 10);
		getArea(7.5);

	}
}
