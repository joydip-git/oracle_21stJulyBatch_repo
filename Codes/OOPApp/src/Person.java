/**
 * <h2>Represents a Person</h2>
 * 
 * @author satarupa
 *
 */
public class Person {
	/**
	 * data members: firstName, lastName, address and asalary of any Person
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
	}

	/**
	 * @param firstName first name of the person
	 * @param lastName  last name of the person
	 * @param address   address of the person
	 * @param salary    salary of the person
	 */
	public Person(String firstName, String lastName, String address, float salary) {
		super();
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

	/**
	 * 
	 * @return the full name of the person
	 */
	public String getFullName() {
		return firstName + " " + lastName;
	}

	/**
	 * 
	 * @return full name, address and salary of the person
	 */
	public String showFullInformation() {
		return this.getFullName() + " " + address + " " + salary;
	}
}
