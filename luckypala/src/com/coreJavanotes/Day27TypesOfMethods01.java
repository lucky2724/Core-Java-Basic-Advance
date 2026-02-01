package com.coreJavanotes;

public class Day27TypesOfMethods01 {
	public static void main(String[] args) {
		/*
		 
	-------------------------------------------------------------------------
		TYPES OF METHODS 01:
		
		why we need methods:
			-to achive the reusability of code.
			-modularization
			-Instead of writing same logic multiple times we can define it once inside in method and reuse whenever needed.
		
		what is method:
			-A method is block of code to perform a specific task or functionality.
			-It contain any number of statements and logic depending on the requirements.
			-Mthods improve readability,maintainbility and reusability of code.
			
		How we create a method:
			syntax-1:
				<return_type> methodName(){
					//statements
				}
				
			syntax-2:
				<access_modifier> <modifier> <return_type> methodName(<Parameters>){
					//statements
					//return value
				}
				
		Types of methods in java:
			1)User-defined methods
				-Methods created by programmer.
					Ex:
						void display(){
							sop("Hello java");
						}
						
			2)pre-defined methods
				-Methods are provided by java libraries like
					-System.out.println(),
					-Math.sqrt()
					-Math.min()....etc
			
		Based on Nature (main classification) ==>
			1)static methods
				-Belong to class not object
				-call by using class name or directly or object reference .
				
				Ex:
					class Test{
						static void hello(){
							sop("haii");
						}
						psvm(){
							Test.hello();
							hello();
						}
					}
			
			2)Instance methods
				-Belong to object of class
				-call by using object reference
			
		Other specialized types of methods:
			3)abstract -declare without implementatin must be overriden in subclass
			4)final  -cannot override once declared
			5)synchronized -using in multiThreading to prevent simultaneous access by multiple threads
			6)factory -
			7)default -
						
			
			there are 4 ways to declare a methods:
			
				1)No return type + No arguments ==>  void display()
				2)No return type + with arguments  ==> void add(int a,int b)
				3)with return type + No arguments  ==>  int getNumber()
				4)with return type + with arguments  ==> int add(int a ,int b)
				
		
		==>Whether its static ,instance,user-defined,pre-defined 
				-All methods must be called explixitly..
				except main() method
				
			main() method is called by the JVM..
			-->automtically calls when program starts..
			
		 */
	}
}
