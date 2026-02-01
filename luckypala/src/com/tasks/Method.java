package com.tasks;
import java.util.Scanner;
public class Method {
	static Scanner sc=new Scanner(System.in);
	
	void add(int a,int b) {
		int sum=a+b;
		int newVal1=10;
		sub(sum,newVal1);
	}
	
	void sub(int a,int b) {
		add(a,b);
		int sub=a-b;
		int newval2=20;
		mul(sub,newval2);
		
	}
	
	void mul(int a,int b) {
		
	}
	
	
	void main() {
		System.out.println("main method started..");
		
	}
}
