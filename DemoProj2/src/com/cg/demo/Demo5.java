package com.cg.demo;

public class Demo5 {

	public int a;
	public static int b;
	
	public Demo5()
	{
		
	}
	
	public class Inner
	{
		
	}
		
	public void display()
	{
		System.out.println("display() method");
	}
	
	public static void main(String[] args) {
		
		Demo6 obj=new Demo6();
		obj.display();
	}

}
