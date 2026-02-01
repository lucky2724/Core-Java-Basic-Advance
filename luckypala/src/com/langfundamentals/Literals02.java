package com.langfundamentals;

import java.util.Arrays;

public class Literals02 {
	public static void main(String[] args) {
		String s="java";   //string literals  1 objects
		String s1="java";  // stored in SCP - string constant pool   0 objects
		s1="spring";
		String str=new String("python");   //String objects stored in Heap Area and SCP (Anonymous object)  // 2  objects
		String str1=new String("python");   //1 objects //same in scp
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(s==s1);
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		
		
		char ch[]=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		
	}
}
