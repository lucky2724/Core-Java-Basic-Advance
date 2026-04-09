package com.logicBuilding150;

public class LB06Swap2Nums {
	public static void main(String[] args) {
		int a=10;
		int b=40;
		
		System.out.println("====== before swap =====");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("======= After swap ======");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
