import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		System.out.println("enter person name to greet: ");
		
		Scanner scannerObj = new Scanner(System.in);
		String name = scannerObj.nextLine();
		scannerObj.close();
		
		String message = Greetings.greetPerson(name);
		System.out.println(message);
	}

}
