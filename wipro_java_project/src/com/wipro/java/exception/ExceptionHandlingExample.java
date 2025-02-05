package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        handleCheckedException();
        handleUncheckedException();
    }

    // Method to demonstrate Checked Exception
    public static void handleCheckedException() {
        try {
            File file = new File("Wrong Path");
            FileReader reader = new FileReader(file);
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e.getMessage());
            System.out.println("Wrong file path, kindly check the path.");
        }
    }

    // Method to demonstrate Unchecked Exception
    public static void handleUncheckedException() {
        try {
            String str = "Meghana"; // This will cause a NullPointerException
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
            System.out.println("Check if the string is initialized properly.");
        }
    }
}
