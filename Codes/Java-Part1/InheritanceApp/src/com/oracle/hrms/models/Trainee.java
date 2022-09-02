package com.oracle.hrms.models;

/**
 * @author satarupa
 *
 */

public class Trainee extends Person {

	private String departmentName;
	private String projectName;
	private String organizationName;

	/**
	 * Default constructor
	 */
	public Trainee() {
		// super("abcd", "def", "asjhdgas", 0);
		// TODO Auto-generated constructor stub
		System.out.println("[Trainee] default ctor");

	}

	public Trainee(String firstName, String lastName, String address, float salary, String department, String project,
			String organization) {
		super(firstName, lastName, address, salary);
		System.out.println("[Trainee] parameterized ctor");
		this.departmentName = department;
		this.projectName = project;
		this.organizationName = organization;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the organizationName
	 */
	public String getOrganizationName() {
		return organizationName;
	}

	/**
	 * @param organizationName the organizationName to set
	 */
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	//always this method will be called when you create instance of this class
	//no matter whether you save that reference in a variable for base (up-casting) or child class
    @Override
	public String showInformation() {
		String partialInfo = super.showInformation();
		return partialInfo + " " + departmentName + " " + projectName;
	}
}

