package com.example;

import java.util.Scanner;

class Person{
	int age;
	Scanner sc =new Scanner(System.in);
	public void getAge() {
		System.out.println("enter your age ");
		age =sc.nextInt();
		
	}
}

class Checker extends Person{
	public void check() {
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}
		
		else {
			System.out.println("you are not eligible to vote");
		}
	}
}


public class InhDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checker c1= new Checker();
		c1.getAge();
		c1.check();
	}

}
