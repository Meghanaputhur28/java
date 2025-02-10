package com.wipro.java.usecase2;

import java.util.*;

//Encapsulation: Base class representing an Item
class Item {
 private String name; // Private variables for encapsulation
 private double price;

 // Constructor to initialize Item attributes
 public Item(String name, double price) {
     this.name = name;
     this.price = price;
 }

 // Getter method for name
 public String getName() {
     return name;
 }

 // Getter method for price
 public double getPrice() {
     return price;
 }

 // Method to display item details
 public void display() {
     System.out.println("Item: " + name + ", Price: " + price);
 }
}

//Inheritance and Polymorphism: Derived class with an additional attribute
class ElectronicItem extends Item {
 private int warranty; // Additional attribute for electronic items

 // Constructor to initialize ElectronicItem attributes
 public ElectronicItem(String name, double price, int warranty) {
     super(name, price); // Calling parent class constructor
     this.warranty = warranty;
 }

 @Override // Polymorphism: Method Overriding
 public void display() {
     System.out.println("Electronic Item: " + getName() + ", Price: " + getPrice() + ", Warranty: " + warranty + " years");
 }
}

//Abstraction: Interface defining collection operations
interface CollectionOperations {
 void addItem(Item item); // Method to add an item
 void removeItem(String name); // Method to remove an item
 void displayItems(); // Method to display items
}

//LinkedList Implementation
class LinkedListCollection implements CollectionOperations {
 private LinkedList<Item> linkedList; // LinkedList to store items

 public LinkedListCollection() {
     linkedList = new LinkedList<>();
 }

 public void addItem(Item item) {
     linkedList.add(item);
 }

 public void removeItem(String name) {
     linkedList.removeIf(item -> item.getName().equalsIgnoreCase(name));
 }

 public void displayItems() {
     System.out.println("\nLinkedList Items:");
     for (Item item : linkedList) {
         item.display();
     }
 }
}

//ArrayList Implementation
class ArrayListCollection implements CollectionOperations {
 private ArrayList<Item> arrayList; // ArrayList to store items

 public ArrayListCollection() {
     arrayList = new ArrayList<>();
 }

 public void addItem(Item item) {
     arrayList.add(item);
 }

 public void removeItem(String name) {
     arrayList.removeIf(item -> item.getName().equalsIgnoreCase(name));
 }

 public void displayItems() {
     System.out.println("\nArrayList Items:");
     for (Item item : arrayList) {
         item.display();
     }
 }
}

//HashMap Implementation
class HashMapCollection implements CollectionOperations {
 private HashMap<String, Item> itemMap; // HashMap to store items with name as key

 public HashMapCollection() {
     itemMap = new HashMap<>();
 }

 public void addItem(Item item) {
     itemMap.put(item.getName(), item);
 }

 public void removeItem(String name) {
     itemMap.remove(name);
 }

 public void displayItems() {
     System.out.println("\nHashMap Items:");
     for (Map.Entry<String, Item> entry : itemMap.entrySet()) {
         entry.getValue().display();
     }
 }
}

//Main class
public class OopsOperations {
 public static void main(String[] args) {
     // Using LinkedList
     CollectionOperations linkedListCollection = new LinkedListCollection();
     linkedListCollection.addItem(new Item("Book", 15.99));
     linkedListCollection.addItem(new ElectronicItem("Laptop", 1200.49, 2));
     linkedListCollection.displayItems();
     linkedListCollection.removeItem("Book");
     linkedListCollection.displayItems();
     
     // Using ArrayList
     CollectionOperations arrayListCollection = new ArrayListCollection();
     arrayListCollection.addItem(new Item("Pen", 2.50));
     arrayListCollection.addItem(new ElectronicItem("Phone", 800.75, 1));
     arrayListCollection.displayItems();
     arrayListCollection.removeItem("Pen");
     arrayListCollection.displayItems();
     
     // Using HashMap
     CollectionOperations hashMapCollection = new HashMapCollection();
     hashMapCollection.addItem(new Item("Tablet", 500.99));
     hashMapCollection.addItem(new ElectronicItem("Camera", 950.30, 3));
     hashMapCollection.displayItems();
     hashMapCollection.removeItem("Tablet");
     hashMapCollection.displayItems();
 }
}
