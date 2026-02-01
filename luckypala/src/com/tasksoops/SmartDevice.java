package com.tasksoops;

public class SmartDevice extends Device {
	void useDevice() {
		if (isPowerOn()) {
			System.out.println("Power ON...");
		}else {
			System.out.println("Power OFF...");
		}
	}
}
