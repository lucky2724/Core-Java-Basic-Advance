package com.logicBuilding150;

public class LB29FactorialOfNum {
	public static void main(String[] args) {
		int n=8;
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
