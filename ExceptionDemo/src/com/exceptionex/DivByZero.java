package com.exceptionex;

import java.util.Scanner;

public class DivByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try {
		System.out.println("value of b:");
		
		int[] a=  new int[5];
		a[5]=50/10;
		}
		catch (ArithmeticException e){
			System.out.println(e);
			System.out.println("can't divide by 0");
		}
		
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
	}

}
