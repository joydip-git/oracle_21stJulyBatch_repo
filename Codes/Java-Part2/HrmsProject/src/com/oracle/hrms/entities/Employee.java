/**
 * 
 */
package com.oracle.hrms.entities;

/**
 * @author satarupa
 *
 */
public class Employee {
	private final int id;
	private float basicSalary;
	private float daSalary;
	private float hraSalary;
	private float totalSalary;
	private String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		id = 0;
	}

	public Employee(int id, String name, float basicSalary, float daSalary, float hraSalary) {
		super();
		this.name = name;
		this.id = id;
		this.basicSalary = basicSalary;
		this.daSalary = daSalary;
		this.hraSalary = hraSalary;
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
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the basicSalary
	 */
	public float getBasicSalary() {
		return basicSalary;
	}

	/**
	 * @param basicSalary the basicSalary to set
	 */
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	/**
	 * @return the daSalary
	 */
	public float getDaSalary() {
		return daSalary;
	}

	/**
	 * @param daSalary the daSalary to set
	 */
	public void setDaSalary(float daSalary) {
		this.daSalary = daSalary;
	}

	/**
	 * @return the hraSalary
	 */
	public float getHraSalary() {
		return hraSalary;
	}

	/**
	 * @param hraSalary the hraSalary to set
	 */
	public void setHraSalary(float hraSalary) {
		this.hraSalary = hraSalary;
	}

	/**
	 * @return the totalSalary
	 */
	public float getTotalSalary() {
		return totalSalary;
	}

	/**
	 * @param totalSalary the totalSalary to set
	 */
	protected void setTotalSalary(float totalSalary) {
		this.totalSalary = totalSalary;
	}

	public void calculateSalary() {
		this.totalSalary = this.basicSalary + this.daSalary + this.hraSalary;
	}
}
