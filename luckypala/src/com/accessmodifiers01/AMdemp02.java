package com.accessmodifiers01;

public class AMdemp02 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		// PrivateAMDemo a = new PrivateAMDemo();
		// --> constructor is private so can not create objectt!!

		// System.out.println(a.a);
		// System.out.println(a.name);
		// a.method1(); --> declared as private so can not access !!

		DefaultAMDemo d = new DefaultAMDemo();

		System.out.println(d.a);
		System.out.println(d.name);
		d.method1();

		System.out.println();

		PublicAMDemo p = new PublicAMDemo();
		System.out.println(p.name);
		System.out.println(p.a);
		p.method2();
	}
}
