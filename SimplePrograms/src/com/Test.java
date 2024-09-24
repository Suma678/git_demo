package com;

class Test {

	// Method without argument and with return statements

		int display() {
		return 10;
	}

	public static void main(String[] args) {

		System.out.println("Start");

		Test t = new Test();
		int result = t.display();

		System.out.println(result);

		System.out.println(t.display());

		System.out.println("End");

	}

}
