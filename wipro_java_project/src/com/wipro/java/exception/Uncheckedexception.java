package com.wipro.java.exception;

public class Uncheckedexception {
	public static void main(String [] args) {
		try {
			String str = "Meghana";
			System.out.println(str.length());
		}
		catch(Exception e) {
			System.out.println("check if string is written or not");
			
		}
	}

	public Uncheckedexception() {
		// TODO Auto-generated constructor stub
	}

}
