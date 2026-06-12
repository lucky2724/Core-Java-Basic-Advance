package com.innerclassesAndEnums;

class Outer4 {
	static int orgId = 123;
	static String orgName = "V-Cube";

	int id = 555;
	String name = "Luckyy";

	void method1() {
		System.out.println("method1 called");

		class Inner4 {
			void method4() {
				System.out.println("method4 Called");
			}
		}

		Inner4 i4 = new Inner4();
		i4.method4();

	}
}

public class LocalInnerClassDemo {
	public static void main(String[] args) {
		System.out.println("main method started");

		Outer4 t = new Outer4();
		System.out.println(Outer4.orgId);
		System.out.println(Outer4.orgName);
		System.out.println(t.id);
		System.out.println(t.name);
		
		t.method1();
		
	}
}
