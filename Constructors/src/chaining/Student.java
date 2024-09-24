package chaining;

public class Student {
	
	Student(int age){
		this("Tom");
		System.out.println("Age : "+age);
	}
	
	Student(double height)
	{   //gives error if height is integer even though the variable name is different so change it to double 
		this(22);
		System.out.println("Height : "+height);
	}
	
	Student(String name) {
		System.out.println("Name : "+name);
	}
	
	public static void main(String[] args) {
		
		new Student(5.6);
	
	}
}
