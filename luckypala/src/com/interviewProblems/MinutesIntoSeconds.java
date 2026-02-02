package com.interviewProblems;

public class MinutesIntoSeconds {
	static int convertSecs(int min) {
		return min * 60;
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int mins = 64;
		int secs = mins * 60;

		System.out.println(convertSecs(mins));
		System.out.println(mins + " minutes is Nothing but " + secs + "  seconds!!");
	}
}
