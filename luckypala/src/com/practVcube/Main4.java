package com.practVcube;

class P {
	P() {
		display();
	}

	void display() {
		System.out.println("P display");
	}
}

class Q extends P {
	Q() {
		System.out.println("Q");
	}

	@Override
	void display() {
		System.out.println("Q display");
	}
}

public class Main4 {
	public static void main(String[] args) {
		
		new Q();

	}
}
