package com.oracle.databaseapp.entities;


public class Employee implements Comparable<Employee> {

	private String name;
	private int id;
	
	public Employee() {		
	}
	
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
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
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Employee other) {
		return  Integer.compare(this.id, other.id);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.id+" "+this.name;
	}
	
}
