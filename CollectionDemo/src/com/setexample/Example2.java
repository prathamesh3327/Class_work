package com.setexample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> Fruits =  new HashSet<String>();
		
		//Add operation for adding the element in the set
		Fruits.add("Mango");
		Fruits.add("Apple");
		Fruits.add("Banana");
		Fruits.add("Guava");
	

		Iterator<String> iterator = Fruits.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		//Contains Operation returns the elements specified
		System.out.println("does the set include Banana?"+Fruits.contains("Banana"));
		
		//size operation return the size of the set
		System.out.println("The size of the Set :" +Fruits.size());
		
		//Remove operation removes the specified element from set
		Fruits.remove("Banana");
		Fruits.remove("Guava");
		System.out.println("Set after removing the elements:"+Fruits);
		
		//Clear operation clears the set
		Fruits.clear();
		System.out.println(Fruits);
		
		
		Set<String> Vegetables = new LinkedHashSet<String>();
		
		//Add operation for adding the element in the set
		Vegetables.add("onion");
		Vegetables.add("LadyFinger");
		Vegetables.add("Eggplant");
		Vegetables.add("corn");
		
        Iterator<String> iterator1 = Vegetables.iterator();
		
		while(iterator1.hasNext()) {
			String name = iterator1.next();
			System.out.println(name);
		}
		//Contains Operation returns the elements specified
		System.out.println("does the set include onion?"+Vegetables.contains("onion"));
		
		//Operation Size return the size of the set
		Vegetables.size();
		System.out.println("The size of the Set :" +Fruits.size());
		
		//Remove operation removes the specified element from set
		Vegetables.remove("Eggplant");
		Vegetables.remove("corn");
		System.out.println("Set after removing the elements:"+Vegetables);
		
		//Clear operation clears the set
		Vegetables.clear();
		System.out.println(Vegetables);

	}

}
