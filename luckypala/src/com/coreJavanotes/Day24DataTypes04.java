package com.coreJavanotes;

public class Day24DataTypes04 {
	public static void main(String[] args) {
		/*
		 
		------------------------------------------------------------------------
			DATA TYPES 04:
				1)premitive data types
					-byte
					-short
					-int
					-long
					-float
					-double
					-char
					-boolean
					
				2)object data types
					-pre-defined data object types
						-Normal or regular object data types
							-string 
							-Arrays
							-StringBuiledr
							-BigInteger
							-BigDecimal..etc
						-wrapper object data types
							-Byte
							-Short
							-Integer
							-Long
							-Float
							-Double
							-Character
							-Boolean
					-user defined object data types
						-class name
						-interface name
							-Studennt
							-Employeee etccccc....
							
							
							
				Auto Boxing:
					In Automatic conversion of premitve data into  wrapper class object 
						Ex:
							int num =10;
							Integer obj=num;
							 ==>Here int is automatically converted to an Integer object.
							 
							 
				Auto unBoxing:
					In Automatic conversion of Wrapper class object to  back into premitive data type
						Ex:
							Integer obj=25;
							int num=obj;
							   ==>Here wrapper object is automayically convert to int..
							   
							 (Use in mainly in collections)..
							 
				
							 
				Type casting:(Type conversion)
					Type casting means converting data  of one data type into another data type....
						==>Implicit Type casting(widening)
							-also called automatic type conversion.
							-converting small data type into large data type.
							-No data loss.
								Ex:
									int num=10;
									double d=num;
									
						==>Explicit type casting(narrowing)
							-also called manual type conversion.
							-performed manually by programmmer  using cast operator (type)
							convert large data type into small data type.
								Ex:
									double d=123.54;
									int i=(int)d
									
 				
						order of immplicit type conversion:
							byte --> short --> int --> long --> float --> double
					
			 	Widening and Narrowing:
			 		It is nothing but implicitt and explicit type conversion...
			 		
			 	Widening ===> Implicit Type conversion
			 		--convert smaller data type to large data type
			 	Narrowing ==> Explicit Type conversion
			 		--convert larger data type to small data type
			 		--must be a cast operator
		 			(type)..
		 			
		-------------------------------------------------------------------
		 */
	}
}
