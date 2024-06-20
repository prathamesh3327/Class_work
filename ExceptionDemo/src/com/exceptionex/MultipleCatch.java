package com.exceptionex;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int c[]=new int[5]; 
			int a=10,b=5;
			c[5]=a/b;
			System.out.println("the division is: "+c);
			
		}
		catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("can't divide by zero");
		}
		
		catch (ArrayIndexOutOfBoundsException o) {
			
			System.out.println(o);
			System.out.println("Please check array index");
		}
		
		finally {
			System.out.println("One should know exception for smooth execution of application ");
		}
	}

}
