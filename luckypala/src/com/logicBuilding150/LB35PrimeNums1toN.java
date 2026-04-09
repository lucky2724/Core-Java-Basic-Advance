package com.logicBuilding150;

public class LB35PrimeNums1toN {
	static boolean isPrime(int n) {
		if(n<=1) return false;
		
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n=50;
		
		//print prime nums 1 to n
		System.out.println("==== Print prime numbers 1 to n =====");
		for(int i=0;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
		
		//print n prime numbers
		System.out.println();
		System.out.println("====== print n prime numbers =====");
		
		int n2=10;
		int count=0;
		int i=2;
		while(count<n2) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
	}
}
