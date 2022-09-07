package com.oracle.reflectionapp.entities;

public class Sample implements ISample {

	private String name;
	private float salary;
	public Sample() {
		
	}
	
	/**
	 * @param name
	 * @param salary
	 */
	public Sample(String name, float salary) {
		//super();
		this.name = name;
		this.salary = salary;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String print() {
		return name+" "+salary;
	}
	
}
