package com.oops;

public class ObjectClassMethods implements Cloneable {

	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("main method started..");

		ObjectClassMethods t1 = new ObjectClassMethods();

		ObjectClassMethods t2 = (ObjectClassMethods) t1.clone(); // Explicit type casting
		
		t2=null;

		System.out.println("====== clone() ======");
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println("====== getClass() ======");
		System.out.println(t1.getClass());
		
		System.out.println("====== hashCode() ======");
		System.out.println(t1.hashCode()); //724542711
		System.out.println(0x2b2fa4f7); //address of t1

		System.out.println("====== finalize() ======");
		System.gc();//remove unreferenced object
		
	}
}
