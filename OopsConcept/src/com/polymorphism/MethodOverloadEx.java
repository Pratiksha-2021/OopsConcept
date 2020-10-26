package com.polymorphism;

public class MethodOverloadEx {
	int a=10;
	double b=20.0;
	 public static void sum(int a)
	    {
	        System.out.println(a);
	    }
	    public static void sum(int a,double b)
	    {
	       System.out.println(a+b);
	    }
	    
	    public static void sum(double a,int b)
	    {
	       System.out.println(a+b);
	    }
	

	
	    public static void main(String args[])
	    {
	    	MethodOverloadEx.sum(10);
	    	MethodOverloadEx.sum(20.1, 10);
	    	MethodOverloadEx.sum(10, 20.1);
	    }
	}


