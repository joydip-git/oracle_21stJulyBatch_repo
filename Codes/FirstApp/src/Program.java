import java.util.Scanner;

public class Program {

	public static void main(String[] args) {	
		
		//accept two numbers from console
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter first number: ");
		int firstNumber = scanner.nextInt();
		
		System.out.print("enter second number: ");
		int secondNumber = scanner.nextInt();		
		
		scanner.close();
		
		//pass those two numbers to addNumbers method
		Calculation calcObjAddress = new Calculation();
		int output = calcObjAddress.addNumbers(firstNumber, secondNumber);
		System.out.println("Result: "+output);
		
		
	}	
}
