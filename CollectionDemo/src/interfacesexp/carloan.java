package interfacesexp;

import java.util.Scanner;

// Class implementing the LoanCalculator interface for CarLoan
public class carloan implements loancalculator {

    // Attributes
    public double principalAmount, loanAmount, rateOfInterest = 7.5;
    public int years;
    Scanner scanner = new Scanner(System.in);

    // Method to display principal amount
    @Override
    public void displayPrincipalAmount() {
        System.out.println("Enter car's principal amount:");
        principalAmount = scanner.nextDouble();
        System.out.println("Enter the number of years for the car loan:");
        years = scanner.nextInt();
    }

    // Method to calculate
    @Override
    public void calculate() {
        loanAmount = (principalAmount * years * rateOfInterest) / 100;
        System.out.println("The car loan amount is: " + loanAmount);
    }

    // Main method
    public static void main(String[] args) {
        carloan obj = new carloan(); // Creating object of CarLoan class
        obj.displayPrincipalAmount(); // Calling method to display principal amount
        obj.calculate(); // Calling method to calculate car loan amount
    }
}
