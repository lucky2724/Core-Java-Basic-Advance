package com.coreJavanotes;

public class Day49LoopingStatements05 {
	public static void main(String[] args) {
		/*
		 
	-----------------------------------------------------------------------------------------
		LOOPING STATEMENTS 05 :
			WHILE LOOP :
				Syntax:
					while(condition){
						//statements
					}
					
			1)WAP to find the sum of given number  ?
				static int sumOfDigits(int n) {
					int sum = 0;
			
					while (n != 0) {
						int digit = n % 10;
						sum += digit;
						n /= 10;
					}
			
					return sum;
				}
				
			2)WAP to find given number is ArmStrong or not ?
			
					static boolean armStrong(int n) {
						int temp = n;
						int digits = Integer.toString(n).length();
						int sum = 0;
				
						while (n > 0) {
							int digit = n % 10;
							sum += Math.pow(digit, digits);
							n /= 10;
						}
				
						return sum == temp;
					}
					
			3)WAP to print reverse a Number of a given number ?
			
				static int reverse(int n) {
					int rev = 0;
					while (n > 0) {
						int digit = n % 10;
						rev = rev * 10 + digit;
						n /= 10;
					}
					return rev;
				}
				
			4)WAP to find the given number is Palindrome or not ?
			
				int rev = 0;
					int temp = n;
			
					while (n != 0) {
						int digit = n % 10;
						rev = rev * 10 + digit;
						n /= 10;
					}
			
					return rev == temp;
				}
			
		 */
	}

}
