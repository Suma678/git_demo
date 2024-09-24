package com;

public class Student {
	static int age = 10;
	static void study() {
		System.out.println("Student is studying");
	}
	public static void main(String[] args) {
	
		int age = Student.age;
		System.out.println(age);//internally it is considered as ClassName.variableName i.e Student.age
		System.out.println("========================");
		Student.study();
		study(); //internally it'll considered as Student.study() i.e ClassName.MethodName
	}
}
	