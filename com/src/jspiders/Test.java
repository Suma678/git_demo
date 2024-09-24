package jspiders;

public class Test {

	{
		System.out.println("In Non-Static Block-1");
	}
	
	{
		System.out.println("In Non-Static Block-2");
	}
	
	public static void main(String[] args) {
			System.out.println("Start");
			
			Test t = new Test();
			
			System.out.println("end");
	}
	
	{
		System.out.println("In Non-Static Block-3");
	}
}
