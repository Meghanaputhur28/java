/**
 * 
 */
package com.wipro.java.oops;

/**Manager = child class
 * employee = parent class
 * extends = keyword
 * 
 */
public class Manager extends employee{

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee employeee = new Manager();
		employeee.setEmp_no (644788);
		employeee.setName("Meghana");
		employeee.setPhone(89851);
		System.out.println(employeee.getEmp_no());
		System.out.println(employeee.getName());
		System.out.println(employeee.getPhone());

	}

}
