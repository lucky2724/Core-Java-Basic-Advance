package com.practVcube;

class Driver {
	void ride() {
		System.out.println("Normal Ride");
	}
}

class AutoDriver extends Driver {
	@Override
	void ride() {
		System.out.println("Auto Ride");
	}

	void special() {
		System.out.println("Special Auto");
	}
}

public class Main3 {
	public static void main(String[] args) {
		//Driver d = new AutoDriver();

		//d.special();  -->Complie time error
	}
}
