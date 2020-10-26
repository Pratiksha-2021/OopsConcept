package com.inheritance;

public class ParentChildTest {

	public static void main(String[] args){
		  // Scenario 1
		     Parent a =new Parent();	// Super class object a is eligible to   
		                        //call only A
		     System.out.println(a.a); 
		     System.out.println(a.b);
		     //System.out.println(a.c);//Error; c does not exist in A
		     a.m1();
		     a.m2();
		     //a.m3(); //Error m3 does not exist in class A
		     
		     
		   /*  Child b =new Child(); System.out.println(b.a); // a of A
		     System.out.println(b.b); // b of B 
		     System.out.println(b.c); // c of B 
		     b.m1();// m1 of A 
		     b.m2();// m2 of B 
		     b.m3(); // m3 of B
		     */
		   /*   A a =new B();
		      System.out.println(a.a);// a of A
		      System.out.println(a.b);// b of A
		     //System.out.println(a.c); //Error c of A does not exist in A 
		     a.m1();// m1 of A
		     a.m2();// m2 of B
		     //a.m3(); //Error m3 of A does not exist in A
*/
		     
	}
}
