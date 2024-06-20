package com.example;

import java.util.Scanner;

class Car{
	int id;
	String type,brandName;
	Double price;
	Scanner sc = new Scanner(System.in);
	
	public void getData() {
		System.out.println("Enter id of car");
		id=sc.nextInt();
		
		System.out.println("Enter name type of car");
		type=sc.next();
		
		System.out.println("Enter brand name of car");
		brandName=sc.next();
		
		System.out.println("Enter price");
		price= sc.nextDouble();
		
	}
	
	public void showData() {
		System.out.println("id: "+ id);
		System.out.println("Brand name: "+brandName);
		System.out.println("type: "+type);
		System.out.println("price: "+price);
		
	}
	
}
public class OPDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.getData();
		c1.showData();
	}

}
