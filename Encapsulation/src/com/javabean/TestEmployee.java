package com.javabean;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp = new Employee();

		System.out.println(emp.getName() + " " + emp.getId());

		System.out.println("============================");
		
		//  Accept using Scanner Class also
		emp.setName("Tom");
		emp.setId(101);

		System.out.println("Name : " +emp.getName());
		System.out.println("ID : " + emp.getId());
	}

}
