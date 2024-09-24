package methods;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Name:");
		String name = s.next();
		
		System.out.println("Enter the age:");
		int age = s.nextInt();
		
		System.out.println("Enter the Salary:");
		double salary = s.nextDouble();
		
		System.out.println("=========================");
		System.out.println("Name: "+name+"\nAge: "+age+"\nSalary: "+salary);
		
		s.close();
	}
}
