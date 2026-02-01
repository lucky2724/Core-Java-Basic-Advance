package com.practVcube;


//import java.util.ArrayList;

public class RemoveAdjocentChars {
	public static void main(String[] args) {
		String s="ccbbadef";
		//output ==>adef;
		//	ArrayList<Integer>
		
		StringBuilder sb = new StringBuilder();
		
		for(char c: s.toCharArray()) {
			int size=sb.length();
			if(size>0 && sb.charAt(size-1)==c) {
				sb.deleteCharAt(size-1);
			}
			else {
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
		
		
	}
}
