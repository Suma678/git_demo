package com;

class Employee {
	
	int id = 1234;
	String name = "Jerry";
	double salary = 4589.155;

	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		
		e.id = 456;
		e.name = "Tom";
		e.salary = 85757.040;
		
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.salary);
	}

}
