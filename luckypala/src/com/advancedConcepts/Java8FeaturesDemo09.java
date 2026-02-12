package com.advancedConcepts;

//class Thread1 implements Runnable {
//
//	@Override
//	public void run() {
//		for (int i = 0; i <= 10; i++) {
//			System.out.println("Thread 1 : " + i);
//		}
//	}
//
//}

public class Java8FeaturesDemo09 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Runnable r = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Child Thread : " + i);
			}
		};

		Thread t2 = new Thread(r);
		t2.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Main Thread : " + i);
		}
	}
}
