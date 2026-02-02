package com.interviewProblems;
import java.util.Scanner;

public class String3PartsHighRadius {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//String 9 characters 
		//first part a=1,b=1,c=2 ==>int char int format (1b3)
		//second part def reverse  ==> fed
		//third part a->b b->c c->d ..... z->a
		//print the format thirdPart + firstPart +secondPart
		
		Scanner sc=new Scanner(System.in);
		System.out.println("main method started");
		System.out.print("Input : ");
		String s=sc.nextLine();
		
		if(s.length()<9 || s.length()>9) {
			System.out.print("Invalid input");
			return;
		}
		
		String first=s.substring(0,3);
		String second=s.substring(3,6);
		String third=s.substring(6,9);
		
		int firstNum=first.charAt(0)-'a'+1;
		char secNum=first.charAt(1);
		int thirdNum=first.charAt(2)-'a'+1;
		
		String firstPart=""+firstNum+secNum+thirdNum;
		System.out.println("first part : "+firstPart);
	
		String secondPart=new StringBuilder(second).reverse().toString();
		System.out.println("Second Part : "+secondPart);
		
		StringBuilder thirdP=new StringBuilder();
		for(char ch:third.toCharArray()) {
			if(ch=='z') {
				thirdP.append('a');
			}else {
				thirdP.append((char)(ch+1));
			}                                                                         
		}
		
		String thirdPart=thirdP.toString();
		System.out.println("third Part : "+thirdPart);
		
		System.out.println("Output : "+thirdPart+firstPart+secondPart);
		
		sc.close();
	}
}
