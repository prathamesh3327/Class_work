package com.exaple;
//interface lab square
public class Test1 implements MyMethods {
	int l=10,area;
	@Override
	public void accept() {
		// TODO Auto-generated method stub
		System.out.println("this is square");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		area=l*l;
		System.out.println("area of Square is "+ area);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1= new Test1();
		t1.accept();
		t1.display();
	}

	
}
