package com.exceptionex;

public class ArrayIndexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[4]=56;
			System.out.println(a[3]);
			System.out.println(a[4]);
			a[8]=67;
			System.out.println(a[8]);
			
		}
		
		catch(Exception e) {
			System.out.println(e);
			System.out.println("we don't have specified array index space");
		}
	}

}
