package interfacesexp;

import java.util.Scanner;

// Class implementing the LoanCalculator interface
public class homeloan implements loancalculator {

    // Attributes
    public double principalAmount, loanAmount, rateOfInterest = 8.5;
    public int years;
    Scanner scanner = new Scanner(System.in);
    
    // Method to display principal amount
    @Override
    public void displayPrincipalAmount() {
        System.out.println("Enter principal amount:");
        principalAmount = scanner.nextDouble();
        System.out.println("Enter the number of years:");
        years = scanner.nextInt();
    }

    // Method to calculate
    @Override
    public void calculate() {
        loanAmount = (principalAmount * years * rateOfInterest) / 100;
        System.out.println("The loan amount is: " + loanAmount);
    }

    // Main method
    public static void main(String[] args) {
        homeloan obj = new homeloan(); // Creating object of HomeLoan class
        obj.displayPrincipalAmount(); // Calling method to display principal amount
        obj.calculate(); // Calling method to calculate loan amount
    }
}
