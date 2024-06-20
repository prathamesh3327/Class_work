package com.exaple;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> alcountries = new ArrayList<String>();
		System.out.println("how many countries to add");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter country ");
			String country=sc.next();
			alcountries.add(country);
		}
		System.out.println(alcountries);
	}

}
