package com;

class Demo {
	
	//method without arguments and without return statement
	
	void display() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		Demo d = new Demo();
		d.display();
		System.out.println("End");
	}
}
