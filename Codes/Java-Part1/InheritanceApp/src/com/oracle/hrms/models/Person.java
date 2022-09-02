package com.oracle.hrms.models;
/**
 * represents any person base class for trainer and trainee
 * 
 * @author satarupa
 *
 */
public class Person {
	/*
	 * protected String firstName; protected String lastName; protected String
	 * address; protected float salary;
	 */
	private String firstName;
	private String lastName;
	private String address;
	private float salary;

	/**
	 * default constructor
	 */
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("[Person] default ctor");
	}

	public Person(String firstName, String lastName, String address, float salary) {
		System.out.println("[Person] parameterized ctor");
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.salary = salary;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	//virtual
	public String showInformation() {
		return getFullName() + " " + address + " " + salary;
	}
}
