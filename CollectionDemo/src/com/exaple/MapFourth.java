package com.exaple;
import java.util.Map;
import java.util.TreeMap;

public class MapFourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, Integer> fruits = new TreeMap<String, Integer>();
		
		fruits.put("Apple", 200);
		fruits.put("Banana", 70);
		fruits.put("Cherry", 100);
		fruits.put("mango", 600);
		
		System.out.println(fruits);
		
		Map<String, Integer> morefruits = new TreeMap<String, Integer>();
		morefruits.put("Strawberry", 150);
		morefruits.put("jackfruit", 200);
		
		fruits.putAll(morefruits);
		System.out.println(fruits);
		
		System.out.println("The Value of searched key is "+fruits.get("mango"));
		
		
		fruits.remove("Cherry");
		System.out.println("List after removing cherry");
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
		
		System.out.println(fruits.isEmpty());
		
		fruits.put("chickoo", 50);
		System.out.println(fruits.isEmpty());
		
		
		
		
	}

}