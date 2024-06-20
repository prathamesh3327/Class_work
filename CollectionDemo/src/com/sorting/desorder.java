package com.sorting;

import java.util.Scanner;

public class desorder {
    // Declare an array of integers with a size of 5
    int a[] = new int[5];
    int i, j, temp;
    Scanner sc = new Scanner(System.in);
    
    // Method to accept 5 elements from the user
    public void accept() {
        System.out.println("ENTER 5 ELEMENTS:");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
    }
    
    // Method to sort the array in descending order using a simple sorting algorithm
    public void sort() {
        for (i = 0; i < 5; i++) {
            for (j = i + 1; j < 5; j++) {
                if (a[i] < a[j]) {
                    // Swap elements if the current element is less than the next element
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    // Method to display the sorted array
    public void display() {
        System.out.println("THE SORTED ELEMENTS ARE:");
        for (i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
    
    // Main method to execute the program
    public static void main(String[] args) {
        desorder obj = new desorder(); // Create an instance of Desorder
        obj.accept(); // Call accept method to input array elements
        obj.sort(); // Call sort method to sort the array
        obj.display(); // Call display method to show the sorted array
    }
}
