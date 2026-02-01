package com.tasks;

public class Employee1 {
	Integer empNo=1;
	String eName="Suryaa";
	Double salary=5000.00;
	String hireDate="25-09-2023";
	Double experience =2.5;
	
	{
		Double anualSalary=12*salary;
		Double anualBonus=anualSalary*0.10;
		Double totalEarnings=anualSalary+anualBonus;
		
		System.out.println("======= Employee details =======");
		System.out.println("Employee Name:"+eName);
		System.out.println("Employee HireDate:"+hireDate);
		System.out.println("Experience:"+experience+" years");
		System.out.println("Anual Salary:"+anualSalary);
		System.out.println("Anual Bonus:"+anualBonus);
		System.out.println("Total Anual Earnings:"+totalEarnings);
		
	}
	void main() {
		
	}

}
