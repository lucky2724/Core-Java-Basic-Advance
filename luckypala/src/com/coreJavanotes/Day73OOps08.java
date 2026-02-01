package com.coreJavanotes;

public class Day73OOps08 {
	public static void main(String[] args) {
		/*
	----------------------------------------------------------------------------
		OOPS 08:
			OVERRIDE 02:
				Method Overriding in Java – Complete Rules (Corrected Notes)
				Rule 1: Method Signature must be the same
				The method signature must be identical in both parent and child classes.
				
				
				Method signature = Method Name + Method Parameters
				
				
				Return type is NOT part of the method signature.
				
				
				void show(int a);   // Parent
				void show(int a);   // Child → Valid overriding
				
				
				Rule 2: Return Type Rules
				If the return type is a primitive data type, it must be exactly the same.
				
				
				For object return types:
				
				
				Until Java 1.4, return types had to be the same.
				
				
				From Java 1.5, Java supports Covariant Return Types (only for object types).
				
				
				Covariant Return Type
				The child class can return:
				
				
				The same object type, or
				
				
				A subclass of the parent’s return type.
				
				
				✅ Allowed:
				Parent → Number
				Child  → Integer / Double
				
				Parent → Object
				Child  → String
				
				❌ Not Allowed:
				Parent → String
				Child  → Object   // Reverse is NOT allowed
				
				
				Rule 3: Method Visibility (Scope) Should NOT Be Reduced
				Visibility order:
				private < default < protected < public
				
				Rules:
				If the parent method is public,
				 → child method must be public.
				
				
				If the parent method is protected,
				 → child method can be protected or public.
				
				
				If the parent method is default,
				 → child method can be default / protected / public.
				
				
				If the parent method is private,
				 → it cannot be overridden.
				
				
				⚠️ If you use @Override on a private method → Compile-time error.
				
				Rule 4: Private Methods Cannot Be Overridden
				Private methods are not visible to child classes.
				
				
				If a child class defines a method with the same name:
				
				
				It is treated as a new method, not overriding.
				
				
				No error unless @Override is used.
				
				
				
				Rule 5: Static Methods Cannot Be Overridden
				Static methods belong to the class, not the object.
				
				
				If a child class defines a static method with the same signature:
				
				
				This is called Method Hiding, NOT overriding.
				
				
				static void test();  // Parent
				static void test();  // Child → Method Hiding
				
				No compile-time or runtime error if @Override is not used.
				
				
				Using @Override → Compile-time error.
				
				
				
				Rule 6: Final Methods Cannot Be Overridden
				A final method cannot be overridden in a child class.
				
				
				Final methods can be accessed, but not overridden.
				
				
				Notes:
				If a class is final, it cannot be extended.
				
				
				Final class methods are implicitly final.
				
				
				Final class variables are NOT automatically final.
				
				
				
				Rule 7: Exception Handling Rules
				If the parent method throws an exception,
				 → child method may or may not throw the exception.
				
				
				If the child method throws an exception,
				 → parent method must throw the same exception or its parent exception.
				
				
				Child method cannot throw broader checked exceptions than the parent.
				
				
				Parent → IOException
				Child  → FileNotFoundException  ✅
				Child  → Exception              ❌
				
				
				Rule 8: Abstract Methods
				If a parent class contains abstract methods,
				 → the child class must override them.
				
				
				If the child class does not override:
				
				
				Then the child class must be declared abstract.
				
				
				Important:
				An implemented method in a child class can be overridden again as abstract in another abstract class.
				
				
				abstract class A {
				    abstract void show();
				}
				
				abstract class B extends A {
				    @Override
				    abstract void show(); // Valid
				}
				
				
				⭐ Interview One-Line Summary
				Method overriding is runtime polymorphism where a child class provides a specific implementation of a parent class method without changing its signature and without reducing visibility.

		 */
	}
}
