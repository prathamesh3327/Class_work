package com.exceptionex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoanEligibility {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isEligible = false;
        String message = "";

        try {
            System.out.print("Enter your nationality (case-insensitive): ");
            String nationality = scanner.nextLine().toLowerCase(); // Convert input to lowercase

            System.out.print("Enter your monthly salary: ");
            double salary = scanner.nextDouble();

            if (!nationality.equals("indian")) {
                throw new IllegalArgumentException("Only Indian citizens are eligible.");
            } else if (salary <= 50000) {
                throw new IllegalArgumentException("Salary must be greater than ₹50,000.");
            } else {
                isEligible = true;
                double loanAmount = salary * 0.7;
                message = String.format("Congratulations! You are eligible for a loan of ₹%.2f.", loanAmount);
            }
        } catch (InputMismatchException e) {
            message = "Invalid input. Please enter a valid nationality and numeric salary.";
        } catch (IllegalArgumentException e) {
            message = e.getMessage();
        } finally {
            scanner.close(); // Close the Scanner object
        }

        System.out.println(message);
    }
}
