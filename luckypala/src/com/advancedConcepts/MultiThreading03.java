package com.advancedConcepts;

public class MultiThreading03 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Hiii -> " + i);
		}
	}

	public static void main(String[] args) {

		MultiThreading03 m1 = new MultiThreading03();
		m1.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("main -> " + i);
		}
	}
}                                                         
