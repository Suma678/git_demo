package com;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the No of Elements to be Inserted:");
	
	int size = scan.nextInt();
		
	int[] a = new int[size];
	
	System.out.println("Enter "+size+" Elements");
	
	for(int i = 0; i<a.length; i++) 
	{
		
		a[i] = scan.nextInt();
	}
		System.out.println("Array Elements are: ");
		
		for(int i = 0; i<a.length ; i++) {
			System.out.println(a[i]+" is present in index position "+i);
		}
		System.out.println("Enter the Element to be find the No. of Occurances:");
		int element = scan.nextInt();
		
		int count = 0;
		
		for(int i = 0; i<a.length; i++) {
			if (element == a[i]) {
				count++;
			}
		}
		System.out.println("No of Occurances of "+element+" is"+count);
	}
}
