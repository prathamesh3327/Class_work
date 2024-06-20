package com.exaple;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

	public static void main(String[] args) {
		// Creating a map using the HashMap
		Map<String, Integer> emp = new HashMap<String, Integer>();
		
		// Insert elements to the map
		emp.put("Sagar66", 7878);
		emp.put("Atharva14", 67544);
		emp.put("Sahil33", 56379);
		emp.put("Prathamesh99", 1234);

		System.out.println("Map:" +emp);
		
		//Access keys of the map
		System.out.println("Keys:" + emp.keySet());
		
		//Access the values of map
		System.out.println("Values:" + emp.values());
		
		//access the entries of map
		System.out.println("Entries:"+ emp.entrySet());
		
		//remove the element from the map
		int value = emp.remove("Atharva14");
		System.out.println("Removed element:" + value);

	}

}
