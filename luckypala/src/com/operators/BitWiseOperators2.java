package com.operators;

public class BitWiseOperators2 {
	public static void main(String[] args) {
		System.out.println("main method started..");
		// ^ -->XOR
	    // any one can be must true.
		//both are true --> false Both are false --> false
		System.out.println(10 ^ 5);//15
		System.out.println(45 ^ 23);//58
		
		// << (left-shift) --> Backward to n positions
		//>> (right-shift) --> Forward to n positions
		
		System.out.println( "<< left-shift Examples ");
		System.out.println(10 << 2); //40 ==>10*2^2
		System.out.println(5 << 3);  //40 ==>5*2^3
		System.out.println(10 << 4); //160 ==>10*2^4
		
		//left-shift formulae --> a*2^b;
		
		System.out.println( ">> right-shift Examples ");
		System.out.println(10 >> 2);//2 ==> 10/2^2
		System.out.println(5 >> 3);//0  ==> 5/2^3
		System.out.println(10 >> 4);//0 ==>10/2^4
		System.out.println(10 >> 1);//5 ==>10/2^1
		
		//right-shift formuulae --> a/2^b 
		
	}
}
