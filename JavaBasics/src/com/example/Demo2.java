package com.example;
import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three values");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		if (a>b && a>c){
			System.out.println("a is greatest");
			
		}
		else if(b>a && b>c) {
			System.out.println("b is greatest");
		}
		else{
			System.out.println("c is greatest ");
		}
		
		

	}

}
