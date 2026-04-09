package com.multithreading;

class JThread1 extends Thread {

	@Override
	public void run() {

		int sum = 0;

		System.out.println("run method called !!");
		for (int i = 0; i <= 5; i++) {
			System.out.println("JThread1 : " + i);
			sum += i;
		}

		System.out.println("Sum J1 : " + sum);

		super.run();

	}
}

class JThread2 extends Thread {

	@Override
	public void run() {

		int sum = 0;

		System.out.println("run method called !!");
		for (int i = 5; i <= 10; i++) {
			System.out.println("JThread2 : " + i);
			sum += i;
		}

		System.out.println("Sum J2 : " + sum);

		super.run();

	}
}

class JThread3 extends Thread {

	JThread1 j1;

	JThread3(JThread1 j1) {
		this.j1 = j1;
	}

	@Override
	public void run() {

		int sum = 0;

		System.out.println("run method called !!");
		for (int i = 10; i <= 15; i++) {

			if (i == 12) {
				try {
					j1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("JThread3 : " + i);
			sum += i;
		}

		System.out.println("Sum J3 : " + sum);

		super.run();

	}
}

public class JoinMethod {
	public static void main(String[] args) {
		System.out.println("main method started");

		JThread1 j1 = new JThread1();
		j1.start();

		JThread2 j2 = new JThread2();
		j2.start();

		JThread3 j3 = new JThread3(j1);
		j3.start();

		System.out.println("main method ended !!");

	}
}
