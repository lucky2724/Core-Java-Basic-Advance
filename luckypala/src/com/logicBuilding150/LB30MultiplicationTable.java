package com.logicBuilding150;

public class LB30MultiplicationTable {
	public static void main(String[] args) {
		int n=3;
		System.out.println("===== Multiplication table of "+n +" ======");
		for(int i=1;i<=10;i++) {
			System.out.println(i+" X "+n+" = "+i*n);
		}
	}
}
