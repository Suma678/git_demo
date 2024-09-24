package com.javabean;

import java.util.Scanner;

// Using Scanner Class AGE initialization
public class TestStudent {

	public static void main(String[] args) {

		Student s = new Student();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Age: ");
		int age = scan.nextInt();
		
		s.setAge(age);
		System.out.println(s.getAge());
	}

}
