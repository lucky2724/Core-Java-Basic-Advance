package com.operators;

public class BitWiseOperators {
	public static void main(String[] args) {
		System.out.println("main method started...");
		//Bit wise opperators
		  // & | ^ ~
		System.out.println("******* & INFO **********");
		System.out.println(true & true ); //true
		System.out.println(true & false ); //false
		System.out.println(false & true ); //false
		System.out.println(false & false); //false
		
		System.out.println("******* | INFO **********");
		System.out.println(true | true ); //true
		System.out.println(true | false ); //true
		System.out.println(false | true ); //true
		System.out.println(false | false); //false
		
		System.out.println("******* & Examples**********");
		System.out.println(10 & 8);//8
		System.out.println(54 & 6);//6
		System.out.println(34 & 24);//0
		System.out.println(12 & 9);//8
		System.out.println(10 & 50);//2
		System.out.println(67 & 27);//3
		System.out.println(87 & 14);//6
		System.out.println(96 & 39);//32
		
		System.out.println("******* | Examples **********");
		System.out.println(10 | 8);//10
		System.out.println(54 | 6);//54
		System.out.println(34 | 24);//58
		System.out.println(12 | 9);//13
		System.out.println(10 | 50);//58
		System.out.println(67 | 27);//91
		System.out.println(87 | 14);//95
		System.out.println(96 | 39);//103
		
		System.out.println("******* ^ XOR INFO **********");
		System.out.println(true ^ true ); //false
		System.out.println(true ^ false );//true
		System.out.println(false ^ true ); //true
		System.out.println(false ^ false); //false
		
		System.out.println("******* ^ XOR Examples **********");
		System.out.println(2 ^2);//0
		System.out.println(2 ^ 8);//10
		System.out.println(12 ^ 16);//28
		System.out.println(26 ^ 45);//55
		System.out.println(10 ^ 20);//30
		
		
		System.out.println("******* ~ tilt INFO **********");
		System.out.println(~9);//-10
		System.out.println(~(-10));//9
	}
}
