package com.cg.demo.p1;

public enum Month {

	JAN, FEB, MAR, APR, MAY;

	void f1()
	{
		
	}
	
	 Month() {
		 System.out.println("Enum class constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("main() method inside enum Month");
	}
	
}
