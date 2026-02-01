package com.coreJavanotes;

public class Day51LoopingStatements07 {
	public static void main(String[] args) {
		/*
	
	--------------------------------------------------------------------
	LOOPING STATEMENTS 07 : 
		1)WAP TO PRINT Nth prime Number 
				static int nthPrime(int n) {
					int count = 0;
					int num = 2;
			
					if (n <= 0) {
						return 0;
					}
			
					while (true) {
						if (isPrime(num)) {
							count++;
			
							if (count == n) {
								break;
							}
						}
						num++;
					}
			
					return num;
				}
			
		2)WAP to print Last prime number
		
			static int lastPrime(int n) {
				int lastPrime = -1;
				for (int i = n; i >= 2; i--) {
					if (isPrime(i)) {
						lastPrime = i;
						break;
					}
				}
				return lastPrime;
			}
			
		3)WAP convert decimal to binary
			static void decimalToBinary2(int n) {
				String rev = " ";
				int temp=n;
				while (n > 0) {
					int digit = n % 2;
					rev = digit + rev;
					n /= 2;
				}
		
				System.out.println(temp + " ->  " + rev);
			}
			
		4)WAP convert Binary to Decimal
			public static void main(String[] args) {
				System.out.println("main method started !!");
				
				int ans=0b1010;
				
				System.out.println(ans);
			}
		 */
	}
}
