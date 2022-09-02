package com.oracle.hrms.models;

/**
 * @author satarupa
 *
 */
public class Trainer extends Person {

	private String domain;
	private String subjects[];

	/**
	 * Default constructor
	 */
	public Trainer() {
		// TODO Auto-generated constructor stub
		System.out.println("[Trainer] default ctor");
	}

	public Trainer(String firstName, String lastName, String address, float salary, String domain, String subjects[]) {
		super(firstName, lastName, address, salary);
		System.out.println("[Trainer] parameterized ctor");
		this.domain = domain;
		this.subjects = subjects;
	}

	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * @return the subjects
	 */
	public String[] getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	@Override
	public String showInformation() {
		String partialInfo = super.showInformation();
		return partialInfo + " " + domain;
	}
}

