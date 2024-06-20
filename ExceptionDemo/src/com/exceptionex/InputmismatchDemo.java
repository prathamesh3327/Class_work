package com.exceptionex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputmismatchDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        
        try {
            System.out.print("Enter a number: ");
            number = sc.nextInt(); 
            
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println(e);
            System.out.println("enter valid number");
            
        } 
    }

	}

