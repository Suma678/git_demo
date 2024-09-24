package com;

class Addition {
	
	//method with arguments and without return statements

	void add(int a, int b) {
		System.out.println("Sum of "+a+" "+b+" is ");
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		
		Addition obj = new Addition();
		
		obj.add(10, 89);
		obj.add(78, 450);
	}

}
