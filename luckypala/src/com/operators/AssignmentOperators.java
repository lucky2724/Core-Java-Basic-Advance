package com.operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		System.out.println("main method started..");
		@SuppressWarnings("unused")
		int a=9;
		int result=0;
		
		result=result+9;
		//result=result+5.5; //error Type mismatch: cannot convert from double to int
		result+=5.5;//compound operators
		System.out.println("result : "+result); //14
		
		result-=5;
		System.out.println("result : "+result); //9
		
		result*=5.5; 
		System.out.println("result : "+result); //49
		
		result/=4.5;
		System.out.println("result : "+result);  //10
		
		result%=6.2;
		System.out.println("result : "+result); //30
	}
}
