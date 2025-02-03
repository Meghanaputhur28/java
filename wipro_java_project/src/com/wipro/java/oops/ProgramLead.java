/**
 * 
 */
package com.wipro.java.oops;

/**projectLeas = child class
 * employee = Parent class
 * extends = keyword
 * 
 */
public class ProgramLead extends employee{

	/**
	 * 
	 */
	public ProgramLead() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String a[]) {
		// TODO Auto-generated method stub
		//ProgramLead programLead = new ProgramLead();
		//ProgramLead programLead1 = (ProgramLead) new employee();
		employee employeee = new ProgramLead();
		employeee.setEmp_no (644788);
		employeee.setName("Meghana");
		employeee.setPhone(89851);
		System.out.println(employeee.getEmp_no());
		System.out.println(employeee.getName());
		System.out.println(employeee.getPhone());

	}

}
