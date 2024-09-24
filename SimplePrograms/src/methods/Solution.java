package methods;

import java.util.Scanner;

public class Solution {
	void add(int a, int b) {
		System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter the First Number :");
			int a = scan.nextInt();

			System.out.println("Enter the Second Number :");
			int b = scan.nextInt();

			s.add(a, b);
			System.out.println("===========================");
			
		}
		scan.close();
	}
}