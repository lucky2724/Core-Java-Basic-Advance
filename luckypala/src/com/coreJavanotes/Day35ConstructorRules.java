package com.coreJavanotes;

public class Day35ConstructorRules {
	/*
	 
-----------------------------------------------------------------------------------------------------------------------------

	CONSTRUCTOR 05:
		
		CONSTRUCTOR RULES:
			1)CONSTRUCTOR AND CLASS NAME MUST BE SAME.
			2)CONSTRUCTORS SHOULD NOT RETURN ANYTHING NOT EVEN ODD.
				NOTE:
					-if any constructor returns a type which will considered as the method but not 
					 a constructor and we will not get any Error.
			3)IF A PROGRAM DOES NOT CONTAIN ANY CONSTRUCTOR THEN JAVA COMPILER WILL CREATE A DEFAULT CONSTRUCTOR.
				NOTE:
					-if a program contain parameterized constructor and if we want to create  a object without passing 
					 any values then we must need to create a no-arg constructor.
			4)IN JAVA CONSTRUCTOR OVERLOADING IS POSSIBLE WITH DIFFERENT TYPES OF ARGUMENTS PASSING TO THE CONSTRUCTORS.
				NOTE:
					Method OverLoading:
						In a program we have a method with the same name and different 0parameters will consider as method overloading.
			5)CONTRUCTORS CAN USE BELOW ACCESS MODIFIERS LIKE
				-PRIVATE   --> Scope is within the class
				-<DEFAULT>  --> within the package
				-PROTECTED  -->within the package + outside of the package of sub class.
				-PUBLIC  -->within the project we can access anywhere.
				EX:
					-If constructor is private we cannot create objects outside of the class.
					-In java if we want to work with singleton design pattern will use this private constructor constructor
					 to create only one object for n number of requests.
				
			6)THE SCOPE OF DEFAULT CONSTRUCTOR PROVIDED BY THT JAVA COMPILER IS CLASS SCOPE.
					-if class is public default constructor scope is public.
					-if the class is <default> your default constructor scope is <default>
					-For a class can not use private.
					-For a class can not use protected.
			7)this() AND super() CAN USE ONLE IN CONSTRUCTORS BUT NOT IN METHODS OR ANY.
			  this() OR  super() EITHER ONE  WILL USE AT A TIME AND IT SHOULD BE IN FIRST LINE OF ANY CONSTRUCTOR UNTILL JAVA 24.
			  	-JAVA 25 WE CAN ANYWHERE IN THE CONSTRUCTORS 
			8)this  AND super WE CAN USE METHODS AND CONSTRUCTORS ALSO BUT WE CAN KEEP ONLY IN INSTANCE AREA .
			9)IF THE PARENT CLASS CONTAINS ONLY PARAMETERIZED CONSTRUCTORS WE WILL GET A COMPILE TIME ERROR AT CHILD CLASS AND 
			  WE CANNOT EXTENDS.
			  	-IF WE WANT TO EXTENDS WE MUST NEED TO CREATE NO-ARG CONSTRUCTOR IN PARENT CLASS.
			  	
			  	
-----------------------------------------------------------------------------------------------------------------------------
	 */
}
