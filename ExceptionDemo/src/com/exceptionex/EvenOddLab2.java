package com.exceptionex;

import java.util.Scanner;

public class EvenOddLab2 {
	
public static void check(int a) {
		
		if (a%2!=0) {
			throw new ArithmeticException ("Input should be even");
			
		}
		
		else {
			System.out.println("It's even number so welcome!!");
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int Num =sc.nextInt();
		check(Num);
	}

}
