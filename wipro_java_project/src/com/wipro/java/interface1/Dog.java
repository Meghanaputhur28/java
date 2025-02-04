package com.wipro.java.interface1;

public class Dog implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Bark");
		// TODO Auto-generated method stub
		
	}
	public static void main(String [] args) {
		Animal dog = new  Dog();
		dog.makeSound();
	}

	

}
