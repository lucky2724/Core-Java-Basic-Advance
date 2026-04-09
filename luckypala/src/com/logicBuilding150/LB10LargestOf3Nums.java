package com.logicBuilding150;

public class LB10LargestOf3Nums {

	public static void main(String[] args) {
		int a=220;
		int b=38;
		int c=110;
		
		if(a>b && a>c) {
			System.out.println(a+" is big");
		}else if(b>a && b>c) {
			System.out.println(b+" is big");
		}else {
			System.out.println(c+" is big");
		}
	}

}
