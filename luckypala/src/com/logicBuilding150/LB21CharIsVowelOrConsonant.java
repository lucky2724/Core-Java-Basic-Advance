package com.logicBuilding150;
import java.util.*;
public class LB21CharIsVowelOrConsonant {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Single Alphabet Character:");
		char ch=sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println(ch+" is vowel..");
		}else {
			System.out.println(ch+" is consonant..");
		}
		sc.close();
	}
	
}
