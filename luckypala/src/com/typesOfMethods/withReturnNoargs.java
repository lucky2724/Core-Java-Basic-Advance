package com.typesOfMethods;

import java.util.Scanner;

public class withReturnNoargs {
	static Scanner sc=new Scanner(System.in);
	
	int addition() {
		System.out.println("Enter your Sum val1:");
		int sumVal1=sc.nextInt();
		System.out.println("Enter your sum val2:");
		int sumVal2=sc.nextInt();
		
		return sumVal1+sumVal2;
	}
	
	double subtraction() {
		System.out.println("Enter your sub val1:");
		double subVal1=sc.nextDouble();
		System.out.println("Enter your sub val2:");
		double subVal2=sc.nextDouble();
		
		return subVal1-subVal2;
	}
	
	double multiplication() {
		System.out.println("Enter your mul val1:");
		int mulVal1=sc.nextInt();
		System.out.println("Enter your mul val2:");
		int mulVal2=sc.nextInt();
		
		return mulVal1*mulVal2;
	}
	
	int division() {
		System.out.println("Enter your div val1:");
		int divVal1=sc.nextInt();
		System.out.println("Enter your div val2:");
		int divVal2=sc.nextInt();
		
		return divVal1/divVal2;
	}
	
	int modulas() {
		System.out.println("Enter your mod val1:");
		int modVal1=sc.nextInt();
		System.out.println("Enter your mod val2:");
		int modVal2=sc.nextInt();
		
		return modVal1 % modVal2;
	}
	
	void main() {
		int sum=addition();
		double sub=subtraction();
		double mul=multiplication();
		int div=division();
		int mod=modulas();
		
		System.out.println("********************************");
		System.out.println("Sum of 2 Nums:"+sum);
		System.out.println("Subtraction of two nums:"+sub);
		System.out.println("Multiplication of two nums:"+mul);
		System.out.println("Division of two nums:"+div);
		System.out.println("modulas of two nums:"+mod);
		System.out.println("********************************");
		
		System.out.println("Sum of sum of 2 nums + sum of subtraction of 2 nums:"+(sum+sub));
		System.out.println("Sum of multiply of 2 nums + sum of division of 2 nums:"+(mul+div));

		
	}
}
