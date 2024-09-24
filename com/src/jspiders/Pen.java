package jspiders;

public class Pen {
	static int x = 10;
	
	static
	{
		x = 20;
	}
	public static void main(String[] args) {
		
		System.out.println(x);
		Pen p = new Pen();
	}
	{
		x= 30;
	}
}
//since object is created after print statement so x ->20
//if object was created before print statement then value of x ->30; 