package com.exceptionex;

public class ThrowDemo {

	public static void validate(int age) throws Exception{
		// TODO Auto-generated method stub
		if (age<18) {
			throw new ArithmeticException("person is not eligible to vote ");
			
			
		}
		else {
			System.out.println("person is eligible to vote");
			
		}
	}

	
	public static void main(String[] args) throws Exception {
		validate(13);
		System.out.println("rest of code..");
	}
}
