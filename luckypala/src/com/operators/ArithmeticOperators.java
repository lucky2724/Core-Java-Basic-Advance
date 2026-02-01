package com.operators;

import java.util.Scanner;

public class ArithmeticOperators {
	//Arithmetiic operators +,-,*,/,%
	public static void main(String[] args) {
		System.out.println("main method started..");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a value : ");
		int a=sc.nextInt();//100
		
		System.out.println("Enter b value : ");
		int b=sc.nextInt();//10
		
		//BODMAS RULE
		System.out.println("Addition : "+a+b); //10010
		System.out.println("Addition : "+(a+b)); //110
		
		System.out.println("Subtraction : "+(a-b)); //90
		
		System.out.println("Multiplictaion : "+a*b); //1000
		
		System.out.println("Dicvision or Qu0tient : "+a/b); //10
		
		System.out.println("Modulas or reminder : "+a%b);
		
		sc.close();
	}
}
