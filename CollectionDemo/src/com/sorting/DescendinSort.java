package com.sorting;

import java.util.Scanner;

public class DescendinSort {
    private static final int SIZE = 5;
    private int[] a = new int[SIZE];

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + SIZE + " numbers for the array:");
        for (int i = 0; i < SIZE; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    public void sort() {
        for (int i = 0; i < SIZE - 1; i++) {
            for (int j = i + 1; j < SIZE; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public void display() {
        System.out.println("Sorted numbers in descending order are:");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        DescendinSort ds = new DescendinSort();
        ds.accept();
        ds.sort();
        ds.display();
    }
}
