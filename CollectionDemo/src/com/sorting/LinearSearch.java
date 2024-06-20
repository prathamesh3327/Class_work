package com.sorting;


import java.util.Scanner;

	public class LinearSearch {

		public static void main(String[] args) {
			
			int i, len, key, arr[];
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter Array length: ");
			len = input.nextInt();
			arr = new int[len];
			System.out.println("Enter " + len + " elements");
			for (i=0; i<len; i++)
			{
				arr[i] = input.nextInt();
			}
			System.out.println("Enter the search key value: ");
			key = input.nextInt();
			for (i=0; i<len; i++)
			{
				if (arr[i] == key)
				{
					System.out.println(key + " is present at location " + (i+1));
					break;
				}
			}
			if (i==len)
				System.out.println(key + " doesn't exist in array.");
		}
	}