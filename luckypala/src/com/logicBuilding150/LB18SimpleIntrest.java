package com.logicBuilding150;

public class LB18SimpleIntrest {
	public static void main(String[] args) {
		double principleAmount=10000;
		double rateOfIntrest=4;
		double time=2;
		
		// simpleInrest=(p*t*r)/100
		double simpleIntrest=(principleAmount* rateOfIntrest*time)/100;
		
		System.out.println("Simple intrest : "+simpleIntrest);
		
	}
	
}
