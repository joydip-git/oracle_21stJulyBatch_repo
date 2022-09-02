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
		String information = personObjRef.showFullInformation();
		
		//printing full information of the instance
		System.out.println(information);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 1. ask user about how many person instances to create
		int noOfRecords = getPersonCount(scanner);
		
		//	2. create an ARRAY to store references of Person class instances (objects)
		//the type of elements in this array is Person		
		Person[] people = new Person[noOfRecords];

		// 3. creating instances of Person class and storing them in the array
		for (int i = 0; i < noOfRecords; i++) {
			
			// a. creating instances of Person class
			Person personInstanceRef = CreatePerson(scanner);
			
			// b. storing the instance the array
			people[i]=personInstanceRef;		
		}
		
		scanner.close();
		
		//printing the information of all people
		for (int i = 0; i < noOfRecords; i++) {
			Person singlePersonInstanceRef = people[i];
			printPersonInformation(singlePersonInstanceRef);			
		}	
	
		/*
		Person pRef = new Person("neha","agarwal","mumbai",20000);
		System.out.println( pRef.getFirstName());
		pRef.setFirstName("Divya");
		System.out.println( pRef.getFirstName());
		*/
	}
}
