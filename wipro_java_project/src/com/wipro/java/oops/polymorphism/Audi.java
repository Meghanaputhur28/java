/**
 * 
 */
package com.wipro.java.oops.polymorphism;
/**
 * 
 */
public class Audi extends Car{
	
	public void showSpeed() {
    	System.out.println("Speed of Audi: "+getSpeed());
}
	public void showWeight() {
		System.out.println("Weight of Audi : "+getWeight());
}
	public static void main(String a[]) {
		Car obj1=new Audi(); 
		obj1.setSpeed(180f);
		obj1.showSpeed();
	}
}