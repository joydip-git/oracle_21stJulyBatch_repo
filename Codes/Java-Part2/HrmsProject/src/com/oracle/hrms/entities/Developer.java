/**
 * 
 */
package com.oracle.hrms.entities;

/**
 * @author satarupa
 *
 */
public class Developer extends Employee {
	float incentivePayment;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(int id, String name, float basicSalary, float daSalary, float hraSalary, float incentivePayment) {
		super(id, name, basicSalary, daSalary, hraSalary);
		this.incentivePayment = incentivePayment;
	}

	/**
	 * @return the incentivePayment
	 */
	public float getIncentivePayment() {
		return incentivePayment;
	}

	/**
	 * @param incentivePayment the incentivePayment to set
	 */
	public void setIncentivePayment(float incentivePayment) {
		this.incentivePayment = incentivePayment;
	}

	/* (non-Javadoc)
	 * @see com.oracle.hrms.entities.Employee#calculateSalary()
	 */
	@Override
	public void calculateSalary() {		
		super.calculateSalary();
		this.setTotalSalary(this.getTotalSalary()+this.incentivePayment);
	}	
	

}
