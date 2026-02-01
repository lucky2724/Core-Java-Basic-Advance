package com.practVcube;

public class Switch {
	public static void main(String[] args) {
		System.out.println("main method started..");
		char ch='e';
		
		switch(ch) {
		case 'a' : case 'e' : case 'i' : case 'o' : case 'u':
			System.out.println("Vowels");
			break;
		default:
			System.out.println("Consonants");
		}
	}
}
