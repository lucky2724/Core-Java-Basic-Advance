package com.logicBuilding150;

public class LB26SumOfFirstNnaturalNums {
	public static void main(String[] args) {
		int n=10;
		int sum=0;
		
		int ans=n*(n+1)/2;
		
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum of N natural numbers : "+sum);
		System.out.println("Using formulae:"+ans);
	}
}
