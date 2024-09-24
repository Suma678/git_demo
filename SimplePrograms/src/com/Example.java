package com;

class Example {
	
	//method with arguments and with return statements
	int findSquareOf(int n)
	{
		return n*n;
	}
	public static void main(String[] args) {
		
		Example e = new Example(); //Object Creation
		int result = e.findSquareOf(9); //Calling the method and assigning it to a variable called result
		
		System.out.println(result);
		
		System.out.println(e.findSquareOf(23));
	}

}