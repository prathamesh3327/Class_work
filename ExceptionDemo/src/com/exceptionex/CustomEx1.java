package com.exceptionex;

import java.util.Scanner;

public class CustomEx1 {
	
	
	public static void check(int a) {
		
			if (a<18) {
				throw new ArithmeticException ("you are not eligible for voting");
				
			}
			
			else {
				System.out.println("you are eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age =sc.nextInt();
		check(age);

	}

}
