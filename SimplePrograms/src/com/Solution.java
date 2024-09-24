package com;

class Solution {
	void m1() {
		System.out.println("Learning Java");

	}
	
	void m2(String name, int age) {
		System.out.println("Name: "+name+" Age: "+age);
		
	}
	String m3() {
		return "Quintessential";
		
	}
	int m4(int a, int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
	
		Solution s = new Solution();
		
		s.m1();
		System.out.println("************");
		
		s.m2("John",23);
		System.out.println("=============");
		
		System.out.println(s.m3());
		
		int result = s.m4(45, 151);
		System.out.println(result);
		
		System.out.println(s.m4(85,34));
	}

}
