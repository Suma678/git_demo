package com;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isPerfectNumber(int num) {
		if (num <= 1) {
			return false; // There are no perfect numbers less than or equal to 1
		}

		int sum = 0;

		// Find all divisors of number and add them
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		// Check if sum of divisors equals the number
		return sum == num;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print("Enter a number: ");
			int num = scanner.nextInt();

			if (isPerfectNumber(num)) {
				System.out.println(num + " is a perfect number.");
			} else {
				System.out.println(num + " is not a perfect number.");
			}
		}
	}
}