package org;

public class Employe {
	int id;
	String name;
	double salary;
	
	Employe(int id, String name, double salary){
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public static void main(String[] args) {
		
		Employe e1 = new Employe(10, "Tom", 454545);
		Employe e2 = new Employe(20, "Jerry", 7878778);
		
		System.out.println("Employee Details");
		System.out.println("-------------------------------");
		
		System.out.println("Name : "+e1.name);
		System.out.println("ID : "+e1.id);
		System.out.println("Name : "+e2.name);
		System.out.println("ID : "+e2.id);
	}
}
