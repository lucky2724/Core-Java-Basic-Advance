package com.advancedConcepts;

public class MultiThreading05 extends MultiThreading04 implements Runnable {

	@Override
	public void run() {
		System.out.println("run method started");
		for (int i = 0; i <= 10; i++) {
			System.out.println("run : " + i);
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		MultiThreading05 m3 = new MultiThreading05();

		Thread t = new Thread(m3);
		t.start();
		m3.run();

		for (int i = 11; i <= 20; i++) {
			System.out.println("main : " + i);
		}

	}

}
