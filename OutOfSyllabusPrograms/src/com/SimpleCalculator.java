package com;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input first number
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            // Input operator
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);

            // Input second number
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            // Perform the operation
            double result = calculate(num1, num2, operator);

            // Display the result
            System.out.println("The result is: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double calculate(double num1, double num2, char operator) throws ArithmeticException {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Invalid operator. Use +, -, *, or /.");
        }
    }
}
