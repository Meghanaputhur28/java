package com.wipro.java.oops.encapsulation;

public class Animal {

	/**
	 * 
	 */
	private String name;
	private int age;
	private float weight;
	public Animal(String name,int age,float weight) {
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.age=age;
		this.weight=weight;
	}

	/**
	 * @param args
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Animal("Panda",5,42f);
		obj.setName("Giraffe");
		obj.setAge(11);
		obj.setWeight(67f);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getWeight());

	}

}