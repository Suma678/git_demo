package com;

class Student {
	String name;
	int marks;
	
	public static void main(String[] args) {
		
	
		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.name+" "+s1.marks);
		System.out.println(s2.name+" "+s2.marks);
		System.out.println("=============");
		
		s1.marks = 345;
		s1.name = "Tom";
		
		s2.name = "Jerry";
		s2.marks = 788;
		
		System.out.println(s1.name+" "+s1.marks);
		System.out.println(s2.name+" "+s2.marks);
		}
}
