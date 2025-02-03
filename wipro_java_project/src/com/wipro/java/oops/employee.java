/**
 * 
 */
package com.wipro.java.oops;

/**employee = Parent class
 * Developer, Manager, programLead = class
 * extends = keyword
 * 
 */
public class employee {
	
	private int emp_no; 
	private String name;
	private String emailId;
	private int phone;
	private boolean isTaxApplicable;
	
	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}


	
	

	/**
	 * 
	 */
	public employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
