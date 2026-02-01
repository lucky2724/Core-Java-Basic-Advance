package com.tasksoops;

public class Main {
	public static void main(String[] args) {
		System.out.println("main method started..");

		Car c = new Car("TATA");

		c.accelrate();
		c.accelrate();
		c.accelrate();
		c.accelrate();
		c.accelrate();
		c.accelrate();
		
		c.brake();
		c.brake();
		
		c.displaySpeed();
		c.accelrate();
		c.accelrate();
		c.accelrate();
		c.accelrate();
		c.accelrate();
		c.accelrate();
		c.accelrate();
		c.accelrate();
		c.accelrate();
		
		c.displaySpeed();

	}
}
