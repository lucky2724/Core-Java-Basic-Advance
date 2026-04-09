package com.logicBuilding150;

public class LB31ReverseANumber {

	public static void main(String[] args) {
		int n=1234;
		int rev=0;
		
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		System.out.println("Revese Number:"+rev);
		//System.out.println(1%10);
	}

}
