package com.operators;

public class Assignment_Operators {
	public static void main(String[] args) {
		//Assignment Operators
		//  =,+=,-=,*=,/=,%=
		
		int a=10;
		int b=5;
		
		System.out.println("======== Addithion ===========");
		int result=a+b;  //15
		result=result+10;  //25
		System.out.println("Result with sum 1 : "+result); //25
		//result=result+5.6;  //Type mismatch: cannot convert from double to int
		result+=5.6;  //5 add .6 not add
		System.out.println("Result with sum 2 : "+result);//30
		
		
		System.out.println("======== Subtraction ===========");
		int result2=a-b;;
		System.out.println("Result with subtraction 1 : "+result2);//5
		//result2=result2-2.4;  //Type mismatch: cannot convert from double to int
		result2-=2.4;  //.4 add then minus
		System.out.println("Result with subtraction 2 : "+result2);//2
		
		
		System.out.println("======== Multiplication ===========");
		int result3=a*b;
		System.out.println("Result with multiplication 1 : "+result3);//50
		//result3=result3*4.5; //Type mismatch: cannot convert from double to int
		result3*=4.5;
		System.out.println("Result with multiplication 2 : "+result3);
		
		
		System.out.println("======== Division ===========");
		int result4=a/b;
		System.out.println("Result with Division 1 : "+result4);
		//result4=result4/2.5;  //Type mismatch: cannot convert from double to int
		int x=20;
		int y=3;
		result4=x/y;
		result4/=2.5;
		System.out.println("Result with Division 2 : "+result4);
		
		
		
		System.out.println("======== Modulas ===========");
		int m=2399;
		int n=13;
		int result5=m%n;
		System.out.println("Result with Division 1 : "+result5);
		//result5=result5%4.3;  //type mismatch: cannot convert from double to int
		result5%=2.4;
		System.out.println("Result with Division 2 : "+result5);
		
				
	}
}
