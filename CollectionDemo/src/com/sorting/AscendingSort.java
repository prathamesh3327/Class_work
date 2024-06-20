package com.sorting;

import java.util.Scanner;

public class AscendingSort {
	int a[] = new int[5];
	
	int i,j,temp;
	Scanner sc =new Scanner(System.in);
	public void accept() {
		System.out.println("Enter numbers in array");
		for (i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
	}
	
	public void sort() {
		for(i=0;i<5;i++) {
			for(j=i+1;j<5;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
	}
	
	public void display() {
		System.out.println("Sorted numbers are: ");
		
		for(i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AscendingSort as=new AscendingSort();
		as.accept();
		as.sort();
		as.display();
	}

}
