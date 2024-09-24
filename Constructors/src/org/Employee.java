package org;

class Employee {
	
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary){
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("Employee Id : "+this.id);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Salary : "+this.salary);
		System.out.println("============================");
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee(10, "Tom", 454545);
		Employee e2 = new Employee(20, "Jerry", 7878778);
		
		e1.display();
		e2.display();
	}
}
