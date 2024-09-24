package com.javabean;

public class Student {
	
	private int age;
	
	public void setAge(int age) {
		
		if (age>0) {
			System.out.println("Age Initialized");
			this.age = age;
		}
		else
			System.out.println("Age Cannot be Initialized");
	}
	public int getAge() {
		return this.age;
	}
	

}
