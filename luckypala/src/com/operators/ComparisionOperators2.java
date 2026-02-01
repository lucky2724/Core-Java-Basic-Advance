package com.operators;

public class ComparisionOperators2 {
	public static void main(String[] args) {
		System.out.println("main method startted");
		String s1="Rahman";
		String s2="Rahman";
		
		System.out.println(s1==s2);//true
		
		String s3=new String("surya");  //2 objects 1 in heapMemory  same copy will be created in SCP not pointing any reference
		String s4=new String("surya");
		
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		
		String s5="Lucky";
		String s6="luCKy";
		System.out.println(s5.equalsIgnoreCase(s6));//true
	}
}
