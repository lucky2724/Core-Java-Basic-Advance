package com.advancedConcepts;

class JThread1 extends Thread {

	@Override
	public void run() {
		System.out.println("JThread1 Started!!!");
		int sum = 0;
		for (int i = 0; i <= 50; i++) {
			System.out.println("JThread1 : " + i);
			sum += i;
		}
		System.out.println("JThread1 Sum value : " + sum);
		System.out.println("JThread1 Ended!!!");
	}
}

class JThread2 extends Thread {

	JThread1 j1;

	JThread2(JThread1 j1) {
		this.j1 = j1;
	}

	@Override
	public void run() {
		
		System.out.println("JThread2 Ended!!!");
		int sum = 0;
		for (int i = 50; i <= 100; i++) {
			if (i == 75) {
				try {
					j1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("JThread2 : " + i);
				sum += i;
			}
		}
		System.out.println("JThread2 Sum value : " + sum);
		System.out.println("JThread2 Ended!!!");
	}

}

class JThread3 extends Thread {
	@Override
	public void run() {
		System.out.println("JThread3 Ended!!!");
		int sum = 0;
		for (int i = 100; i <= 150; i++) {
			System.out.println("JThread3 : " + i);
			sum += i;
		}
		System.out.println("JThread3 Sum value : " + sum);
		System.out.println("JThread3  Ended!!!");
	}

}

public class MultiThreading06 {
	public static void main(String[] args) {

		JThread1 j1 = new JThread1();
		j1.start();

		JThread2 j2 = new JThread2(j1);
		j2.start();

		JThread3 j3 = new JThread3();
		j3.start();
	}
}
