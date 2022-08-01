import javax.tools.DocumentationTool.Location;

//access specifier of the class => public (any file in this application as well as
//some other application too can access this class
public class Person {
	// data members
	private String firstName;
	private String lastName;
	private String address;
	private float salary;

	// constructors
	// default
	public Person() {

	}

	// parameterized constructor
	//during object creation, call this constructor and pass the necessary values
	//the values will be assigned to the data members
	public Person(String personFirstName, String personLastName, String personAddress, float personSalary) {
		firstName = personFirstName;
		lastName = personLastName;
		address = personAddress;
		salary = personSalary;
	}

	// methods
	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String getFullInformation() {
		return getFullName() + " " + address + " " + salary;
	}
}
