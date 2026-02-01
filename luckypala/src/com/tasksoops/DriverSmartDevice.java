package com.tasksoops;

public class DriverSmartDevice {
	public static void main(String[] args) {
		System.out.println("main methid started");

		SmartDevice sd = new SmartDevice();

		sd.turnOff();
		sd.useDevice();
		sd.turnOn();
		sd.useDevice();
	}
}
