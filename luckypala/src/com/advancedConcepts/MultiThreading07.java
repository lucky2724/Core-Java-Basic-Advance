package com.advancedConcepts;

class SThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("S Thread1 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreading07 {
	public static void main(String[] args) {
		System.out.println("main method started");

		SThread1 s1 = new SThread1();
		s1.start();
		s1.interrupt();
		for (int i = 0; i < 10; i++) {
			System.out.println("main  Thread : " + i);
		}
	}
}
