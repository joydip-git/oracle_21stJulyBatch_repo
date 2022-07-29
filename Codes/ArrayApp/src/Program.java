import java.util.Scanner;

public class Program {
	static void createIntArray(Scanner scanner) {
		// single dimensional array
		// <data-type>[] <var-name> = new <data-type>[3];
		int[] numbers = new int[3];
		// [] => indexer
		// 0/1/2 => index number

		for (int index = 0; index < 3; index++) {
			System.out.print("enter value at numbers[" + index + "]: ");
			int value = scanner.nextInt();
			numbers[index] = value;
		}
		System.out.println();
		/*
		 * for (int index = 0; index < 3; index++) {
		 * System.out.println("Value at numbers["+index+"]: "+numbers[index]); }
		 */

		// for-each => for only reading purpose. this loop helps you to iterate through
		// a collection and pick up one value at a time from index positions
		// READ-ONLY LOOP
		for (int num : numbers) {
			System.out.println("Value: " + num);
		}

	}

	static void createStringArray(Scanner scanner) {
		
		System.out.print("How many names? ");
		int size = scanner.nextInt();
		String[] names = new String[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print("enter value at names[" + i + "]: ");
			String value = scanner.next();
			names[i] = value;
		}
		System.out.println();
		for (String name : names) {
			System.out.println(name == null ? "NA" : name);
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// createIntArray(scanner);
		createStringArray(scanner);
		scanner.close();
	}
}
