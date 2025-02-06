package com.wipro.java.collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // 1. Array Implementation
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
        
        // 2. ArrayList Implementation
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }
        System.out.println("\nArrayList: " + arrayList);
        arrayList.remove(3);
        System.out.println("After Removing Element at Index 3: " + arrayList);

        // 3. LinkedList Implementation
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0);
        l1.add(6);
        System.out.println("\nLinkedList: " + l1); 
        l1.remove(2);
        System.out.println("After Removing Element at Index 2: " + l1);
        
        
        // 4. HashMap Implementation
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Meghana");
        map.put(2, "Madhavi");
        map.put(3, "Lakshmi Pathy");
        map.put(4, "Srikanth");
        
        System.out.println("\nHashMap Elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        map.remove(2);
        System.out.println("\nHashMap After Removing Key 2:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
