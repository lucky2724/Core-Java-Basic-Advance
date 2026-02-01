package com.oopsPractice;

public class Override02 extends Override01 {
	@Override
	protected void hello() {
		System.out.println("Hello SQL & UI !!");
	}

	void ans() {
		super.hello();
	}
}

class Main {
	public static void main(String[] args) {
		System.out.println("main method started");

		Override02 ov = new Override02();

		ov.hello();

		ov.ans();

	}
}
