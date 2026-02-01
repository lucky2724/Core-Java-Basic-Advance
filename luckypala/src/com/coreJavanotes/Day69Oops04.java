package com.coreJavanotes;

public class Day69Oops04 {

	public static void main(String[] args) {
		/*
	
	-----------------------------------------------------------------------------------
		OOPS 04:
			Inheritance 02 :
				Shallow Copy :
					A shallow copy creates a new object, but copies references of nested objects, not the actual objects.
						-New top-level object is created
						-Nested objects are shared
						-Changes in one object affect the other
						-clone() does shallow copy by default
						
						Ex:
							Student s2 = (Student) s1.clone(); 
				Deep Copy :
					A deep copy creates a new object and new copies of all nested objects.
						-Completely independent objects
						-No shared references
						-Changes do NOT affect original object
						-Requires custom logic (copy constructor / overridden clone)
						
						Ex: 
							Student s2 = new Student(s1);
							
							
					======>Shallow copy copies references, deep copy copies actual objects.
							
				==>When we copy an object, we create another object using the data of the first object.
				-->There are two types of copy:
					1)Shallow Copy
						Shallow copy creates a new object, but both objects share the same inner (referenced) object.
						-📌 In Simple Words
						-Outer object is copied
						-Inner object is not copied
						-Both objects point to the same memory
					2)Deep Copy
						Deep copy creates a new object and also creates new copies of all inner objects.
						-📌 In Simple Words
						-Outer object is copied
						-Inner object is also copied
						-Objects are fully independent
		 */
	}
}
