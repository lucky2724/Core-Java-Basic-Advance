package com.logicBuilding150;

public class LB28SumOfFirstNOddNums {
	public static void main(String[] args) {
		int n=9;
		int count=1;
		int sum=0;
		
		int ans=n*n;
		
		int i=1;
		while(count<=n) {
			if(i%2!=0) {
				sum+=i;
				count++;
			}
			i++;
		}
		System.out.println("Sum of first "+n+ " odd numbers are : "+sum);
		System.out.println("using formulae : "+ans);
		
	}
}
