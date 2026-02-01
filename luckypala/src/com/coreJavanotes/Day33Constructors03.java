package com.coreJavanotes;

public class Day33Constructors03 {
	public static void main(String[] args) {
		/*
		
		------------------------------------------------------------------------------------
			CONSTRUCTORS 03:
				this()
				super()
				
				==> this,super vs this(),super()
				==>Why we need to no-arg constructors when java compiler is provides default constructor..
					-->To provide default values for object instead of JVM providing if we want
					   to add different values then will go for n0-arg constructor.
					 
					-->Whenever class contains parametrised constructor if we want to create a object 
					   with no parameter values then we must need to create no-arg constructor.
					   Why because java compiler will not create any default constructor when we have other constructors.
					   
				Constructor Chaining:
					Why constructor chaining?
						-To avoid duplicate data.
						-Easy initialization of instance data.
					
					What is constructor chaining?
						-Calling one constructor into another constructor by using this() and super();
						
						this() - current class constructor
							same class -->this()
							different ckass -->super()
							
						==>Cyclic should not be in constructomr chaining
						
					this()  --> calls another constructor in same class
					super() --> Calls Parent class constructor
					
					-You can not use both this() and super() in same constructor..
					-Constructor chaining helps to avoid code duplication
					
					
					       ===== this,super and this(),super() ======
					       
					this   --> this is a keyword to invoke current object data members.
					this() --> this () is speacial method to call current class constructor.
					
					super   --> super is a keyword to invoke super class date memebers.
					super() --> super() is a special method to call super class constructor.
		 */
	}
}
