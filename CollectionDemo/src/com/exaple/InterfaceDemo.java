package com.exaple;



public class InterfaceDemo implements MyMethods {
	double r=2,area;
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		
		System.out.println("this is circle");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		area=3.14*r*r;
		System.out.println("Area of cirlce "+area);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceDemo i1= new InterfaceDemo();
		
		i1.accept();
		i1.display();
		
	}


}
