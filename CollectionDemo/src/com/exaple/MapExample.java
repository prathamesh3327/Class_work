package com.exaple;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		// you can't repeat keys
		Map<String, String> map = new HashMap<String, String>();
		map.put("actor", "yash");
		map.put("ceo", "sahil");
		map.put("cleark", "sagar");
		map.put("accountant", "atharva");
		map.put("clerk", "prathamesh");
		
		System.out.println(map.get("doctor"));
		
		Set <String> designation =map.keySet();
		for(String key:designation)
		{
			System.out.println(map.get(key));
		}
		
		for(String key :designation)
		{
			System.out.println(key+ " " +map.get(key));
		}
	}

}
