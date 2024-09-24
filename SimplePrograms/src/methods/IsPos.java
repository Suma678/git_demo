package methods;

import java.util.Scanner;

public class IsPos {
	void num(int n) {
 
		if (n > 0) {
			System.out.println(" The number " + n + " is Positive");
		} else
			System.out.println("The number " + n + " is Negetive");
	}

	public static void main(String[] args) {

		IsPos ip = new IsPos();
		Scanner s = new Scanner(System.in);

		for (int i = 0; i <= 3; i++) {

			System.out.println("Enter the Number : ");
			int n = s.nextInt();
			ip.num(n);

		}
		s.close();
	}
}
