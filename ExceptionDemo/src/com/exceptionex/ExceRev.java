package com.exceptionex;

public class ExceRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a=0,b=0,c;
			c=a/b;
			System.out.println("the division is: "+c);
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("can't divide by zero");
		}
		
		finally {
			System.out.println("One should know exception for smooth execution of application ");
		}
	}

}
