package com.exceptionex;

import java.util.Scanner;

public class Lab2 {
	
	public static void check(int a) {
		
		if (a<=0) {
			throw new ArithmeticException ("age should not be less than zero or negative");
			
		}
		
		else {
			System.out.println("your age is "+a);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter your age");
		age=sc.nextInt();
		check(age);
	}

}
