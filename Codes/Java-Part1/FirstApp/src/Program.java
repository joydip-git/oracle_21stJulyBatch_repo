import java.util.Scanner;
/**
 * Main user interface, the entry point
 * @author satarupa
 *
 */
public class Program {	
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		char toContinue = 'n';

		do {
			// 1. print the menu
			UserInterfaceUtility.printMenu();

			// 2. ask user for choice
			int choiceOfOperation = UserInterfaceUtility.getChoice(scannerObj);

			// 3. ask to enter values
			int firstNumber = UserInterfaceUtility.getValue(scannerObj);
			int secondNumber = UserInterfaceUtility.getValue(scannerObj);

			// 4. invoke operation based on choice
			UserInterfaceUtility.invokeOperation(choiceOfOperation, firstNumber, secondNumber);

			// 5. ask for decision to continue. 			
			toContinue = UserInterfaceUtility.getDecision(scannerObj);
			
			//6. if user enters choice in upper case, 
			//convert the choice in lower case
			if (Character.isUpperCase(toContinue))
				toContinue = Character.toLowerCase(toContinue);

		} while (toContinue == 'y');

		scannerObj.close();
	}
}
