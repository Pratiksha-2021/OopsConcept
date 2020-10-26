package com.polymorphism;

public class MethodOverrideExTest extends MethodOverrideEx{
	 public void m1() 
	    { 
	        System.out.println("From child m1()"); 
	    } 
	  
	    public void m2() 
	    { 
	        System.out.println("From child m2()"); 
	    } 
public static void main(String[] args) {
	MethodOverrideExTest mv=new MethodOverrideExTest();
	mv.m1();
	mv.m2();
}
}
