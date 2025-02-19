package com.wipro.java.linkedInlist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedInList {
    public static void main(String[] args) {
        LinkedList<String> connections = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of LinkedIn connections you want to add:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of connection " + (i + 1) + ":");
            String name = scanner.nextLine();
            connections.add(name);
        }
        
        System.out.println("Your LinkedIn connections:");
        for (String name : connections) {
            System.out.println(name);
        }
        scanner.close();
    }
}
