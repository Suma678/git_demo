package com;

public class Test {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30 };

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println("====================");

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

			System.out.println("===========================");

			for (int x = a.length - 1; x >= 0; x--) {

				System.out.println(a[x]);
			}

			System.out.println("=====================");

			int sum = 0;
			int[] data = { 10, 20, 30 };
			for (int j = 0; j < data.length; j++) {

				sum = sum + data[j];
			}
			System.out.println("Sum = " + sum);

			System.out.println("=======================");

			System.out.println("Average : " + (sum / data.length));
		}
	}
}
