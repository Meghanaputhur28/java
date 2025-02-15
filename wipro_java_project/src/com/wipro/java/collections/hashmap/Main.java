package com.wipro.java.collections.hashmap;

import java.security.KeyStore.Entry;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    // create a hashmap
    HashMap<String, Integer> languages = new HashMap<>();

    // add elements to hashmap
    languages.put("Java", 8);
    languages.put("JavaScript", 1);
    languages.put("Python", 3);
    System.out.println("HashMap: " + languages);
    
    
    //Add elements to a HashMap
    HashMap<String, Integer> numbers = new HashMap<>();

    System.out.println("Initial HashMap: " + numbers);
    // put() method to add elements
    numbers.put("One", 1);
    numbers.put("Two", 2);
    numbers.put("Three", 3);
    System.out.println("HashMap after put(): " + numbers);
    
    HashMap<Integer, String> language1 = new HashMap<>();
    language1.put(1, "Java");
    language1.put(2, "Python");
    language1.put(3, "JavaScript");
    System.out.println("HashMap: " + language1);

    // get() method to get value
    String value = language1.get(1);
    System.out.println("Value at index 1: " + value);
    
    
    
    //Access HashMap Elements
    HashMap<Integer, String> language2 = new HashMap<>();

    language2.put(1, "Java");
    language2.put(2, "Python");
    language2.put(3, "JavaScript");
    System.out.println("HashMap: " + language2);
    // return set view of keys
    // using keySet()
    System.out.println("Keys: " + language2.keySet());
    // return set view of values
    // using values()
    System.out.println("Values: " + language2.values());
    // return set view of key/value pairs
    // using entrySet()
    System.out.println("Key/Value mappings: " + language2.entrySet());
    
    //Change HashMap Value
    HashMap<Integer, String> language3 = new HashMap<>();
    language3.put(1, "Java");
    language3.put(2, "Python");
    language3.put(3, "JavaScript");
    System.out.println("Original HashMap: " + language3);
    // change element with key 2
    language3.replace(2, "C++");
    System.out.println("HashMap using replace(): " + language3);
    
    
    //Remove HashMap Elements
    HashMap<Integer, String> language4 = new HashMap<>();
    language4.put(1, "Java");
    language4.put(2, "Python");
    language4.put(3, "JavaScript");
    System.out.println("HashMap: " + language4);

    // remove element associated with key 2
    String value1 = language4.remove(2);
    System.out.println("Removed value: " + value1);

    System.out.println("Updated HashMap: " + language4);
    
    
    //Iterate through a HashMap
    HashMap<Integer, String> language5 = new HashMap<>();
    language5.put(1, "Java");
    language5.put(2, "Python");
    language5.put(3, "JavaScript");
    System.out.println("HashMap: " + language5);

    // iterate through keys only
    System.out.print("Keys: ");
    for (Integer key : language5.keySet()) {
      System.out.print(key);
      System.out.print(", "); 
    }

    // iterate through values only
    System.out.print("\nValues: ");
    for (String value2 : language5.values()) {
      System.out.print(value2);
      System.out.print(", ");
    }
    
    // iterate through key/value entries
    System.out.print("\nEntries: ");
    for (java.util.Map.Entry<Integer, String> entry : language5.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }
  }
}