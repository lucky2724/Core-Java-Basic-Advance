package com.logicBuilding150;

public class LB34CheckPrimeNumber {
	public static void main(String[] args) {
		int n=13;
		if(n<=1) {
			System.out.println(n+" is not prime");
			return;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(n+" is not prime");
				return;
			}
		}
		System.out.println(n+" is prime");
	}
}
