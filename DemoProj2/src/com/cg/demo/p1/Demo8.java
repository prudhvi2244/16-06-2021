package com.cg.demo.p1;

public class Demo8 {

	static int a=10;
	static void f1()
	{
		System.out.println("f1() is a static method");
	}
		
	
	public static void main(String[] args) {
		
		System.out.println(a);
		Demo8 obj=new Demo8();
		System.out.println(obj.a);
		System.out.println(Demo8.a);
		f1();
		obj.f1();
		Demo8.f1();
		
	}
	
	static 
	{
		System.out.println("This is a static block-1");
	}
	
	static 
	{
		System.out.println("This is a static block-2");
	}
	
	
	static 
	{
		System.out.println("This is a static block-3");
	}
	
}
