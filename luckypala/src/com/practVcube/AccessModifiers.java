package com.practVcube;

interface Am {

}

// private
// for clss -> Illegal modifier for the class TestDm only public, abstract & final,strictfp,<default> are permitted
// for interface -> Illegal modifier for the interface Am; only public & abstract,<default>,strictfp are permitted

//Protected
//for class -> illegal modifier for the class AccessModifiers  only public, abstract & final,strictfp,<default> are permitted
//for Interface -> Illegal modifier for the interface Am; only public & abstract,default,strictfp  are permitted
// for inner class -> Illegal modifier for the local class TeT; only
// strictfp,default,abstract or final is permitted

//public
//Illegal modifier for the local class TeT; only default,strictfp,abstract or final is permitted

public class AccessModifiers {

	public String name;

	static {
		System.out.println("Blocks");
	}

	public AccessModifiers() {
		System.out.println("Hello...");
	}

	public static void hello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		System.out.println("main method started..");

		AccessModifiers a = new AccessModifiers();
		System.out.println(a.name);

		// TestDm d=new TestDm();

		// class TeT {

		// }

	}

}
