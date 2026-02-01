package com.tasksoops;

public class Device {
	boolean power;

	void turnOn() {
		power = true;
	}

	void turnOff() {
		power = false;
	}

	boolean isPowerOn() {
		return power;
	}
}
