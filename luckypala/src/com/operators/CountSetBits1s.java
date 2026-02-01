package com.operators;

public class CountSetBits1s {
	void show() {
		System.out.println(this);
	}
	void main(String[] args) {
		System.out.println("main method started..");
		int n=65;	
		int count=0;
		
		while(n>0) {
			count+=n&1;
			n=n>>1;
		}
		System.out.println(count);
		show();
	}
}
