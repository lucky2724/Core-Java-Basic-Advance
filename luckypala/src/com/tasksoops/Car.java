package com.tasksoops;

public class Car {
	private String brand;
	private int speed;

	public Car(String brand) {
		this.brand = brand;
		this.speed = 0;
	}

	void accelrate() {
		if (speed + 10 > 100) {
			speed = 100;
			System.out.println("Max Speed Reached !!!!");
		} else {
			speed += 10;
		}
	}

	void brake() {
		if (speed - 10 < 0) {
			speed = 0;
		} else {
			speed -= 10;
		}
	}

	void displaySpeed() {
		System.out.println("*****************");
		System.out.println("Brand : " + brand);
		System.out.println("Speed : " + speed);
	}
}
