package com.logicBuilding150;

public class LB33CheckPaindromeNumber {
	public static void main(String[] args) {
		int n=121;
		int dup=n;
		int rev=0;
		
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n/=10;
		}
		if(rev==dup) {
			System.out.println(dup+" is a palindrome number..");
		}else {
			System.out.println(dup+" is not palindrome...");
		}
	}
}
