/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Car {
	private float speed;
	private float weight; 

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	/**
	 * @return the speed
	 */
	public float getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(float speed) {
		this.speed = speed;
	}
    public void showSpeed() {
    	System.out.println("Speed of the Car"+getSpeed());
    	System.out.println("weight of the Car"+getWeight());
}
}