package com.advancedConcepts;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println("run -> " + i);
		}
	}
}

public class MultiThreading09 {
	public static void main(String[] args) {
		System.out.println("main method started");

		MyThread1 m5 = new MyThread1();
		m5.setDaemon(true);
		m5.start();

		System.out.println(m5.isDaemon());

		for (int i = 10; i <= 13; i++) {
			System.out.println("main Thread -> " + i);

		}
	}
}
