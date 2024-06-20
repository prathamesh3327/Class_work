package com.exaple;

import java.util.Map;
import java.util.TreeMap;

public class ProductsLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> products = new TreeMap<>();
		//Adding the elements in the list
		products.put("Books", 001);
		products.put("Pen", 002);
		products.put("Pencil", 003);
		products.put("GeometryBox", 004);
		products.put("Bag", 005);
		System.out.println(products);
		
		Map<String, Integer> moreproducts = new TreeMap<String, Integer>();
		//Adding the element in the list
		moreproducts.put("BookCover", 010);
		moreproducts.put("Fevicol", 011);
		moreproducts.put("Highlighter", 012);
		moreproducts.put("calculator", 013);
		System.out.println(moreproducts);
		
		
		//adding the elements of moreproducts into products
		products.putAll(moreproducts);
		System.out.println(products);
		
		//checking if the list is empty
		System.out.println(products.isEmpty());
		
		//clear the map and check if the map is empty
		products.clear();System.out.println("Map after clearing the map "+products);
		System.out.println(products.isEmpty());

	}

}
		
