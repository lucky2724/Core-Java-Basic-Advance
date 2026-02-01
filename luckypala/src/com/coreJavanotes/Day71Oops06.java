package com.coreJavanotes;

public class Day71Oops06 {
	public static void main(String[] args) {
		/*
	----------------------------------------------------------------------------------------
		OOPS 06 :
			Inheritance 04 :
				Case 1:
					==> Child object & Child reference
						-We can call Both parent and child class functinalities.
						Ex:
							PersonalLoan pl=new PersonalLoan();
		
									System.out.println("=== Child object and child reference ===");
									// child reference child object
									CarLoan cl = new CarLoan();
									cl.display();// child class functionalities
									cl.hello();// parent class functinalities
			
				Case 2 : 
					==>parent Object & parent reference
						-We can call only Parent class Functionalities
						Ex:
							Loan l1=new Loan();
								
								System.out.println("=== Parent object and Parent reference ===");
								// parent reference parent object
								Loan l = new Loan();
								l.hello();
								// l.display(); //child class cant't called
			
				Case 3 :
					==>Child object & parent reference
						-All the process will consider as Up-Casting
						Ex:
							Loan l1=new PersonalLoan();
					
						->We can cal only parent class functionalities and Override methods in parent
						  to child methods also called this is UpCasting and it consider as " DYNAMIC METHOD DISPATCHING ".
						NOTE:
							If any method Override from parent to child then by using parent and child 
							we can call parent class functionalities and also call override child class functionalities.
								
								Ex:
									System.out.println("=== Child object and Parent reference ===");
									// parent reference child object
									Loan l1 = new CarLoan();
									l1.hello();
									// l1.display(); //can't access
					
				Case 4 :
					Parent Object & chlild  reference
						-Can't store Parent object in child referenece.
						-JAva Does not support Doen casting...
			
			
		
				
		
				System.out.println("=== Child object and Parent reference ===");
				// parent reference child object
				Loan l1 = new CarLoan();
				l1.hello();
				// l1.display(); //can't access
		
				System.out.println("=== Parent object and child reference ===");
				// child reference Parent object
				//CarLoan cl = new Loan(); // NOT POSSIBLE
				System.out.println("not possible");
		 */
	}

}
