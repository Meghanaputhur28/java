package com.wipro.java.collections;
import java.util.List;
import java.util.*;


public class LinkedList1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new LinkedList<Integer>();
		l1.add(0, 1);
		l1.add(1, 2);
		l1.add(2, 2);
		System.out.println(l1);
		
		List<Integer> l2  = new LinkedList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		
		l1.addAll(1, l2);
		
		System.out.println(l1);
		
		l1.remove(1);
		System.out.println(l1);
		System.out.println(l1.get(2));
		l1.set(0, 5);
		System.out.println(l1);
		
		// Remove element at index 3
		l1.remove(3);// index

		// Displaying the list after deletion
		System.out.println(l1);

		// Printing elements one by one
		for (int i = 0; i < l1.size(); i++)
			System.out.print(l1.get(i) + " ");

	}

}


