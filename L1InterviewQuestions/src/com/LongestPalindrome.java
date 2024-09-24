package com;

import java.util.Scanner;

public class LongestPalindrome {

	// Function to check if a given string is a palindrome
	public static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	// Function to find the longest palindrome in the given string
	public static String longestPalindrome(String str) {
		String longestPalin = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String substring = str.substring(i, j);
				if (isPalindrome(substring) && substring.length() > longestPalin.length()) {
					longestPalin = substring;
				}
			}
		}
		return longestPalin;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter a string: ");
			String input = scanner.nextLine();

			String longestPalin = longestPalindrome(input);

			if (!longestPalin.isEmpty()) {
				System.out.println("The longest palindrome is: " + longestPalin);
			} else {
				System.out.println("No palindrome found.");
			}

		}
	}
}