package com.logicBuilding150;

public class LB32SumOfDigitsinNum {
	public static void main(String[] args) {
		int n=1238;
		int sum=0;
		
		while(n!=0) {
			int digit=n%10;
			sum+=digit;
			n/=10;
		}
		System.out.println("Sum of digits in a number:"+sum);
	}
}
