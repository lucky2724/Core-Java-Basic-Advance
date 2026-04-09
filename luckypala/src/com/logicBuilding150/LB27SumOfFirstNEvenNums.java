package com.logicBuilding150;

public class LB27SumOfFirstNEvenNums {
	public static void main(String[] args) {
		int n=5;
		int count=1;
		int sum=0;
		
		int i=1;
		
		int ans=n*(n+1);
		
		while(count<=n) {
			if(i%2==0) {
				sum+=i;
				count++;
			}
			i++;
		}
		System.out.println("Sum of first "+n+" even nums are : "+sum);
		System.out.println("using formulae : "+ans);
	}
}
