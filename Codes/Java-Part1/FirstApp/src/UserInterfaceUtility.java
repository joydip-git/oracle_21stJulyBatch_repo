import java.util.Scanner;

/**
 * <h2>Utility class for UI</h2>
 * @author satarupa
 *
 */
public class UserInterfaceUtility {
	public static void printMenu() {
		System.out.println("-------------------MENU-------------------");
		System.out.println("\t1. Add \n\t2. Subtract \n\t3. Multiply \n\t4. Divide");
	}

	public static int getChoice(Scanner scanner) {
		System.out.print("Enter Choice[1/2/3/4]: ");
		
	/* scanner reads the value
	nextInt() method converts the value in integer format
	and returns the integer value  */
		
		int choice = scanner.nextInt();
		return choice;
	}

	public static int getValue(Scanner scanner) {
		System.out.print("Enter Value: ");
		int value = scanner.nextInt();
		return value;
	}

	public static void invokeOperation(int choice, int first, int second) {
		Calculation calculationObject = new Calculation();
		int result = 0;

		switch (choice) {
		case 1:
			result = calculationObject.addNumbers(first, second);
			System.out.println("Addition Result: " + result);
			break;

		case 2:
			result = calculationObject.subtractNumbers(first, second);
			System.out.println("Subtraction Result: " + result);
			break;

		case 3:
			result = calculationObject.multiplyNumbers(first, second);
			System.out.println("Multiplication Result: " + result);
			break;

		case 4:
			result = calculationObject.divideNumbers(first, second);
			System.out.println("Division Result: " + result);
			break;

		default:
			System.out.println("Enter proper choice next time...");
			break;
		}
	}

	public static char getDecision(Scanner scanner) {
		System.out.print("Continue?[y/Y/n/N]: ");
		String ch = scanner.next();
		char choice = ch.charAt(0);		
		return choice;
	}
}
