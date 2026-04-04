package com.multithreading;

//VLC Media Player  :  Audio + Video + Timer

class Audio extends Thread {
	@Override
	public void run() {
		System.out.println("Audio : " + Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			System.out.println("Audio : " + i);
		}
	}
}

class Video extends Thread {
	@Override
	public void run() {
		System.out.println("Video : " + Thread.currentThread());
		for (int i = 10; i <= 20; i++) {
			System.out.println("Video : " + i);
		}
	}
}

class Timer extends Thread {
	@Override
	public void run() {
		System.out.println("Timer :" + Thread.currentThread());
		for (int i = 20; i <= 30; i++) {
			System.out.println("Timer : " + i);
		}
	}
}

public class MultipleFunctionalities {
	public static void main(String[] args) {
		System.out.println("main method started");

		Audio a = new Audio();
		Video v = new Video();
		Timer t = new Timer();

		a.start();
		v.start();
		t.start();

		System.out.println("main method ended ");
	}
}
