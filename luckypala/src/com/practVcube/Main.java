package com.practVcube;

class Ride {
	void fare(int a) {
		System.out.println("INT FARE");
	}
}

class CarRide extends Ride {
	void fare(double a) {
		System.out.println("DOUBLE FARE");
	}
}

public class Main {
	public static void main(String[] args) {
		Ride r = new CarRide();

		r.fare(5);
	}
}
