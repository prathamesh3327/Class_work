package com.exaple;


import java.util.HashMap;
import java.util.Map;

public class StudentsMap {

	public static void main(String[] args) {
		// Creating a map using the HashMap
		Map<String, String> std = new HashMap<String, String>();
		
		// Insert elements to the map
		std.put("A083", "Sagar");
		std.put("A053", "Atharva");
		std.put("A012", "Sahil");
		std.put("A045", "Prathamesh");
		std.put("A001", "Yash");

		System.out.println("Map:" +std);
		
		//Access Student ID's(keys) of the map
		System.out.println("Student ID's:" + std.keySet());
		
		//Access the Student Names(values) of map
		System.out.println("Student names:" + std.values());
		
		//access the entries of map
		System.out.println("Entries:"+ std.entrySet());

	}

}
