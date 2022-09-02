/**
 * 
 */
package com.oracle.hrms.entities;

/**
 * @author satarupa
 *
 */
public class Hr extends Employee{

	private float gratuityPayment;
	
	public Hr() {
		// TODO Auto-generated constructor stub
	}

	public Hr(int id, String name, float basicSalary, float daSalary, float hraSalary, float gratuityPayment) {
		super(id, name, basicSalary, daSalary, hraSalary);
		this.gratuityPayment = gratuityPayment;
	}

	/**
	 * @return the gratuityPayment
	 */
	public float getGratuityPayment() {
		return gratuityPayment;
	}

	/**
	 * @param gratuityPayment the gratuityPayment to set
	 */
	public void setGratuityPayment(float gratuityPayment) {
		this.gratuityPayment = gratuityPayment;
	}

	/* (non-Javadoc)
	 * @see com.oracle.hrms.entities.Employee#calculateSalary()
	 */
	@Override
	public void calculateSalary() {		
		super.calculateSalary();
		this.setTotalSalary(this.getTotalSalary()+this.gratuityPayment);
	}
	
}
