package com;

class Kangaroo {
	double height = 5.5; // Member/Global Variable(Non-Static)
	
	void display() 
	{
		double height = 4.4;   //local variable
		
	System.out.println(height);
	System.out.println(this.height);
	}
	
	public static void main(String[] args) {
		Kangaroo k = new Kangaroo();
		k.display();
	}
}
