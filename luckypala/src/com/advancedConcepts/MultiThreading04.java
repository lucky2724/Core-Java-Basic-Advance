package com.advancedConcepts;

class AudioInfo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("Audio Info !! -> " + i);
		}
	}
}

class VideoInfo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("Video Info !! -> " + i);
		}
	}
}

class TimerInfo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("Timer Info !! -> " + i);
		}
	}
}

public class MultiThreading04 extends Thread { // IMAGINE VLC CLASS

	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.println("Main Info !! -> " + i);
		}
	}

	public static void main(String[] args) {

		AudioInfo ai = new AudioInfo();

		VideoInfo vi = new VideoInfo();

		TimerInfo ti = new TimerInfo();

		MultiThreading04 m1 = new MultiThreading04();

		ai.start();
		vi.start();
		ti.start();
		m1.start();
	}
}
