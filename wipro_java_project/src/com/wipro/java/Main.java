package com.wipro.java;

 
public class Main {
	
	int num = 5;
	 
    public void changeValue(int num) {
        this.num = num;
    }
    
    public static void main(String[] args) {
        Main obj = new Main();      // Created a object instance named as obj
        obj.changeValue(8);              // Changing the num value from changeValue function
        System.out.println(obj.num);	//  printing the num value
    }
}