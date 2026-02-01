package com.practVcube;

public abstract class Abstract {
	abstract void hello();

	void haii() {
		System.out.println("Haii Java by Srikanth Sir !!!");
	}
}

class Lucky extends Abstract {

	@Override
	void hello() {
		System.out.println("Hellooo Java");
	}
}

