package com.wipro.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapImplementation {
	public static void main(String[] args) {
		Map<Integer, String> map = new  HashMap<>();
		map.put(1, "Meghana");
		map.put(2, "Madhavi");
		map.put(3, "Lakshmi Pathy");
		map.put(4, "srikanth");
		
		System.out.println("Key 1: " +map.get(1));
		System.out.println("Key 2: " +map.get(2));
		System.out.println("Key 3: " +map.get(3));
		System.out.println("Key 4: " +map.get(4));
		
		if (map.containsKey(5)) {
			System.out.println("Key 3 exists with value:" +map.get(3));
			
		}
		System.out.println("\nIterating through the map: ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("entry.getKey()" + ":"+entry.getValue() );
		}
		map.remove(2);
		System.out.println("\nMap through the map: ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	


}
