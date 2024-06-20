package com.exaple;

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("\nArea Calculator");
            System.out.println("1. Area of Square");
            System.out.println("2. Area of Rectangle");
            System.out.println("3. Area of Circle");
            System.out.println("4. Area of Triangle");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Perform action based on user's choice
            switch (choice) {
                case 1:
                    calculateSquareArea(scanner);
                    break;
                case 2:
                    calculateRectangleArea(scanner);
                    break;
                case 3:
                    calculateCircleArea(scanner);
                    break;
                case 4:
                    calculateTriangleArea(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void calculateSquareArea(Scanner scanner) {
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double area = side * side;
        System.out.println("The area of the square is: " + area);
    }

    private static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

    private static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);
    }

    private static void calculateTriangleArea(Scanner scanner) {
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
    }
}
