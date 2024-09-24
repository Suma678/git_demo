package com;

public class Demo {
	
	public static void main(String[] args) {
		
		/*Array Declaration*/
		int [] a;
		
		/*Array Creation*/
		a = new int[3];
		
		/*printing Array elements*/
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("=====================");
		
		/*Array Initialization */
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		System.out.println("=====================");
		
		//Array Declaration and Creation
		double[] x = new double[4];
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		
		System.out.println("Length : "+x.length);
		
		
		
	}
}
