package com.abstractionConcept;

public class InterAInterBTest implements InterA,InterB {
	public void myMetod() {
		System.out.println("multiple inheritance example using interface");

		
	}
	
	public void myMethod() {
		System.out.println("hello java");

		
	}
	public static void main(String[] args) {
		InterAInterBTest id=new InterAInterBTest();
		id.myMethod();
		
	}
	
		
	

	

}
//output=hello java


