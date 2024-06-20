package com.exceptionex;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int c=Integer.parseInt("2");
			System.out.println(c);
			
			int a =Integer.parseInt("hi");
			
			
		}
		catch(Exception e) {
			System.out.println(e);
			
			
		}
		
		finally {
			System.out.println("java");
		}
	}

}
