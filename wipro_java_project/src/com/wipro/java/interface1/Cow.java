package com.wipro.java.interface1;

public class Cow implements Animal{

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("humbaa");
		
	}
	public static void main(String [] args) {
		Animal cow = new Cow();
		cow.makeSound();
	}


}
