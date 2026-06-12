package com.innerclassesAndEnums;

enum TrafficLight {
	RED, YELLOW, GREEN
}

public class SignalTraffic {
	public static void main(String[] args) {

		TrafficLight signal = TrafficLight.YELLOW;

		TrafficLight[] trafficLights = TrafficLight.values();

		for (TrafficLight t : trafficLights) {
			System.out.println(t);
		}

		System.out.println("---------------------");

		switch (signal) {
			case RED -> System.out.println("STOP");
			case YELLOW -> System.out.println("READY");
			case GREEN -> System.out.println("GO");
		}
	}
}
