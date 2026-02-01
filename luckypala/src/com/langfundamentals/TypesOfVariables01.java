package com.langfundamentals;

public class TypesOfVariables01 {
	static int ID=102;
	
	//Global variables
		//instance
		//static 
	//Instance variables
	//instance + primitive variable
	int a=101;  
	
	//instance + object  variable
	String str="Luckyy";
	
	
	
	//static variables
	//static + primitive variable
	static int A1=1001;
	
	//static + object variable
	static String S="Bowwww";
	
	
	@SuppressWarnings("static-access")
	static void main() {
		System.out.println("main method started...");
		int id=67;

		 
		//JVM does not provide default value for local variables 
		//Local variables
		//local + premitive variable
			int num=59;
			
		// local + object variable
			String name="sirisha";
			
		
		
		TypesOfVariables01 t1=new TypesOfVariables01();
		
		System.out.println(" ======= Accesing local varible data =======");
		System.out.println("instance + local variable ==>"+ num);
		System.out.println("object + local variable ==>"+ name);
		
		//Accessing instance data
		System.out.println("======== Accesing instance data ========");
		System.out.println("instance + primitive variable ==> "+t1.a);
		System.out.println("instance + object  variable ===> "+t1.str);
		
		
		//Accessing static data   -->Accesing by using dirctly or class name or reference bariables
		System.out.println(" ======= Access static data =======");
		
		System.out.println("static + primitive variable ==> "+TypesOfVariables01.A1); //By using class Name
		System.out.println("static + object variable ==> "+TypesOfVariables01.S); 
		
		System.out.println("static + primitive variable ==> "+t1.A1);  //By using reference variable
		System.out.println("static + object variable ==> "+t1.S);
		
		System.out.println("static + primitive variable ==> "+A1);   //By using directly
		System.out.println("static + object variable ==> "+S);
		
		
		System.out.println("Access local variable as same name ==> "+id);
		System.out.println("Access static variable as same name ==> "+TypesOfVariables01.ID);
	}

}
