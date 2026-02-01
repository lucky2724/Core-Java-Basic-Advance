package com.logicalstatements;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		
		if(n/2*2==n) {
			System.out.println(n+" is Even number");
		}else {
			System.out.println(n+" is odd number"); 
		}
		
		sc.close();
	}
}
