package com.exaple;


	import java.util.Scanner;

	public class SwitchDemo {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Display welcome message and instructions
	        System.out.println("Welcome to the Java Calculator!");
	        System.out.println("Please enter two numbers:");
	        
	        // Get the first number from the user
	        System.out.print("First number: ");
	        double num1 = scanner.nextDouble();
	        
	        // Get the second number from the user
	        System.out.print("Second number: ");
	        double num2 = scanner.nextDouble();
	        
	        // Display operation options
	        System.out.println("Select an operation:");
	        System.out.println("1 - Addition");
	        System.out.println("2 - Subtraction");
	        System.out.println("3 - Multiplication");
	        System.out.println("4 - Division");
	        
	        // Get the operation choice from the user
	        System.out.print("Your choice: ");
	        int choice = scanner.nextInt();
	        
	        double result;

	        // Perform the selected operation using a switch statement
	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
	                break;
	            case 2:
	                result = num1 - num2;
	                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
	                break;
	            case 3:
	                result = num1 * num2;
	                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operation choice.");
	                break;
	        }

	        scanner.close();
	    }
	}
