package com.sorting;

import java.util.Scanner;

public class largestno {
	int a[] = new int[5];
	int i, j, temp;
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("ENTER 5 ELEMENTS:");
		for (i=0;i<5;i++) 
		{
			a[i]=sc.nextInt();
		}
	}
	public void sort() 
	{
		for(i=0;i<5;i++) 
		{
			for(j=i+1;j<5;j++) 
			{
				if(a[i]<a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
	}
	public void display() 
	{
		System.out.println("THE SORTED ELEMENT ARE:");
		for(i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}
	public void largestvalue() 
	{
	System.out.println("the second largest number is :" +a[1]);
	System.out.println("the second smallest : "+a[a.length-2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largestno obj = new largestno();
		obj.accept();
		obj.sort();
		obj.display();
		obj.largestvalue();
	}

}
