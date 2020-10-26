package com.encapsulation;

public class EncapsulationEx {
	
	private  int age;
	
	public  void setAge(int ageStu){
		
		if(ageStu>0){
			age=ageStu;
			System.out.println(1);
		}
		else{
			age=0;
			System.out.println(2);
		}
		
	}
	public static void main(String[] args) {
		
		EncapsulationEx ex=new EncapsulationEx();
		ex.setAge(-70);
	}

}
