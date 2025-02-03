/**
 * 
 */
package com.wipro.java.oops;

public class Flower {
	String FlowerColour;
	int FlowerWeight;
	String FlowerName;


	public Flower(String Colour, int Weight, String Name) {
		this.FlowerColour = Colour;
		this.FlowerWeight = Weight;
		this.FlowerName = Name;
	}
	
	void display() {
		System.out.println("Flower Colour:"+FlowerColour+"  Flower weight="+FlowerWeight+"  Flower Name"+FlowerName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower Flowerobject1 = new Flower("Pink" , 5 , "tulip");
		Flower Flowerobject2 = new Flower("Red",4, "Red");
		Flowerobject1.display();
		Flowerobject2.display();

	}

}
