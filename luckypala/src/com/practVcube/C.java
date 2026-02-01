package com.practVcube;

public class C {
	C(){
		this(5);
		System.out.println("No arg constructor..");
	}
	
	C(int x){
		this("Java");
		System.out.println("Int constrctor "+x);
	}
	
	C(String s){
		System.out.println("String constructor "+s);
	}
	
	public static void main(String[] args) {
		C obj=new C();
		System.out.println(obj);
	}
	
}
