package com.sorting;


import java.util.Scanner;

public class BinarySearch {
    private static final int SIZE = 5;
    private int[] a = new int[SIZE];

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + SIZE + " numbers for the array:");
        for (int i = 0; i < SIZE; i++) {
            a[i] = sc.nextInt();
        }
    }

    public void sort() {
        for (int i = 0; i < SIZE - 1; i++) {
            for (int j = i + 1; j < SIZE; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public int binarySearch(int key) {
        int left = 0;
        int right = SIZE - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if key is present at mid
            if (a[mid] == key) {
                return mid;
            }

            // If key is greater, ignore the left half
            if (a[mid] < key) {
                left = mid + 1;
            }
            // If key is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If the key is not present in the array
        return -1;
    }

    public void display() {
        System.out.println("Sorted numbers in ascending order are:");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        bs.accept();
        bs.sort();
        bs.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search:");
        int key = sc.nextInt();
        sc.close();

        int result = bs.binarySearch(key);
        if (result == -1) {
            System.out.println("Number not found in the array.");
        } else {
            System.out.println("Number found at index: " + result);
        }
    }
}
