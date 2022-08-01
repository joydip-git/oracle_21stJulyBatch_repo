import java.util.Scanner;

public class Program {

	static int getPersonCount(Scanner scanner) {
		
		System.out.print("How many person records? ");
		int count = scanner.nextInt();		
		return count;
	}

	static Person CreatePerson(Scanner scanner) {
		
		System.out.print("Enter First Name: ");
		String firstName = scanner.next();

		System.out.print("Enter Last Name: ");
		String lastName = scanner.next();

		System.out.print("Enter Address: ");
		String address = scanner.next();

		System.out.print("Enter Salary: ");
		float salary = scanner.nextFloat();		

		// personObjRef is a reference variable, holding reference of an object/instance
		// of Person class
		Person personObjRef = new Person(firstName, lastName, address, salary);
		return personObjRef;
	}

	static void printPersonInformation(Person personObjRef) {
		//calling method to get full information of the instance
		String information = personObjRef.getFullInformation();
		
		//printing full information of the instance
		System.out.println(information);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// ask user about how many person instances to create
		int noOfRecords = getPersonCount(scanner);

		// creating instances of Person class
		for (int i = 0; i < noOfRecords; i++) {
			Person personInstanceRef = CreatePerson(scanner);
			printPersonInformation(personInstanceRef);			
		}		
		scanner.close();
	}
}
