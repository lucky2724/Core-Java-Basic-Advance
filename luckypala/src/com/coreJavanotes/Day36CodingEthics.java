package com.coreJavanotes;

public class Day36CodingEthics {
	public static void main(String[] args) {
		System.out.println("main method started..");
		/*
	----------------------------------------------------------------------
		Language fundamentals Conclusion :
			1)Sop - System.out.println
				System --> System is a class from java.lang package
				   	   --> system class contain sevaral usefull class fields and methods.It can not be instantiated.
				out --> out is a static variable from System class. and it reference of printstream class.
				println --> println is a method from printStream class.
							So if we want to call println method we  need to use System.out.println();
				
				fields -
					static printStream err ==> standard error output stream
					static InputStream in  ==> standard input stream
					static printStream out ==> standard output strea
					
					Ex;
						static String name="lucky";
							-name is reference variable of String class
							-String is class from java.lang package
							
						
			2)main method related :
				Before 25 Version - the below syntax is mandotory to execute a java program.
					public static void main (String [] args){
					
					}
					
				After 25 version - the above syntax is not mandotory we can write main method given below
					1)void main (){
					
					}
					
					2)static void main (String [] args){
					
					}
					
					3)public static void main (String [] args){
					
					}
					
					USE ALSE FOR MAIN METHOD
						->final
						->synchronized
						->strictfp
						            
						                     
					String [] args : pass command line argunments at rum time we eill use arguments
					
			3)JAVA CODING STANDARDS
				Readable,flexible,maintainble,professional
					ctrl+shift+f  --> Code formating must be use
				==>Use comments 
					-ctrl+shift+c --> single line comment
					-ctrl+shift+/ --> multi line comments
					
				==>class and Interface names Pascal case
					-->Each word starts with Capital
						Ex:Class ArrayElemntes{
						
						   }
				
					==>Method Names & variable name in Camel case
						-->first letter small
					
					==>ststic and final 
						use ALL_UPPPERCASE_WITH_UNDERSCORES
							Ex:
								static void COLLEGE_NAME;
								
					==>Pacakage name all are small
						Ex:
							com.example.librarysystem.
					
					==>boolean
						--> isPrime
						--> has married
					
						
	-----------------------------------------------------------------------
		 */
		for(String arg: args) {
			System.out.println(arg);
		}
		
	}
}
