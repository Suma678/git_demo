package com;

/*Access public member 
  outside the class but same package*/
public class TestStudent {

	 public static void main(String[] args) {
		
		 Student s = new Student();
		 
		 System.out.println(s.marks);
	}
	
}
