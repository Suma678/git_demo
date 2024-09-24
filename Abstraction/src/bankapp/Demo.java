package bankapp;

import java.util.Scanner;

public class Demo {

	Scanner scan = new Scanner(System.in);
	int choice = scan.nextInt();

	while(true)
	{
		switch (choice) {

		case 1:
			System.out.println("Hai Dinga!");
			break;

		case 2:
			System.out.println("Bye Dinga!");
			break;

		case 3:
			System.out.println("Thank You!");
			System.exit(0);

		default:
			System.out.println("Invalid Output");
		}
	}
}
