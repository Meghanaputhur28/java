/**
 * 
 */
package com.wipro.java.oops;
// Plain old java object access through getter and setter
// Pojo will have toString class
//Pojo do not have constructor
/** properties of Pojo
 * no constructor
 * getter have  return value
 * setter have no return value
 * properties are determined through private fields
 * values or behaviors are determined through setters
 * toString will cover the entire animal class with properties and behaviors
 * 
 * 
 */
public class Animal {
	// private properties
	private String name;
	private String colour;
	private float height;
	private float weight;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}


	/**
	 * 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
