package com.wipro.java.studenthashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {
    public static void main(String[] args) {
        // Creating a HashMap with Roll Number as key and Name as value
        HashMap<Integer, String> studentMap = new HashMap<>();
        
        // Adding 10 students with duplicate names but unique roll numbers
        studentMap.put(1, "Meghana");
        studentMap.put(2, "Kaushik");
        studentMap.put(3, "Vinay"); // Duplicate name
        studentMap.put(4, "Sonia");
        studentMap.put(5, "Nirma"); // Duplicate name
        studentMap.put(6, "Pooja");
        studentMap.put(7, "Sandeep");
        studentMap.put(8, "Krishna");
        studentMap.put(9, "Sweety"); // Duplicate name
        studentMap.put(10, "Raja");
        
        // Printing the student details
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
