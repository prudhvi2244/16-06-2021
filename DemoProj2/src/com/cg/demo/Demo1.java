package com.cg.demo;

public class Demo1 {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setSid(1);
		s1.setSname("Prudhvi");
		s1.setScity("Goa");
		
		Student s2=new Student();
		s2.setSid(2);
		s2.setSname("Rajeev");
		s2.setScity("Hyderabad");
		
		System.out.println("Student ID :"+s1.getSid());
		System.out.println("Student Name :"+s1.getSname());
		System.out.println("Student City :"+s1.getScity());
		
		System.out.println("*******************************");
		
		System.out.println("Student ID :"+s2.getSid());
		System.out.println("Student Name :"+s2.getSname());
		System.out.println("Student City :"+s2.getScity());
		
	}

}
