package com.example;

import java.util.Scanner;

class EmpDetails{
	int id;
	String empName;
	Double salary;
	Scanner sc = new Scanner(System.in);
	
	public void getData() {
		System.out.println("Enter id of emplyee");
		id=sc.nextInt();
		
		System.out.println("Enter name of employee");
		empName=sc.next();
		
		System.out.println("Enter salary");
		salary= sc.nextDouble();
		
	}
	
	public void showData() {
		System.out.println("id: "+ id);
		System.out.println("name: "+empName);
		System.out.println("salary: "+salary);
		
	}
	
}
public class OOPDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails emp=new EmpDetails();
		emp.getData();
		emp.showData();
	}

}
