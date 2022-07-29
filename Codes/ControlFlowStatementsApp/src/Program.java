
public class Program {

	static void makeDecisionUsingIfElse() {
		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b && a > c) {
			int m = 100;
			System.out.println(a);
		} else if (b > c) {
			int n = 200;
			System.out.println(b);
		} else {
			int o = 300;
			System.out.println(c);
		}

		// System.out.println(m);

		/*
		 * if (a > b) if (a > c) System.out.println(a); else System.out.println(c); else
		 * if (b > c) System.out.println(b); else System.out.println(c);
		 */

		// if(condition){//code if true}
		// else {//code if false}
		/*
		 * if (a > b) { if (a > c) { System.out.println(a); } else {
		 * System.out.println(c); } } else { System.out.println(b); }
		 */
		// boolean isGreater = a > b ? true : false;
		/*
		 * boolean isGreater; if (a > b) { isGreater = true; } else { isGreater = false;
		 * }
		 * 
		 * if (a > b) { System.out.println(a); }
		 */
	}

	static void makeDecisionUsingSwitch() {

		// possible case value data types: int, short, byte, long, char, enumeration,
		// String (>=Java 7)
		int choice = 4; // 1/2/3
		switch (choice) {
		case 1:
			System.out.println("sorted by id");
			break;

		case 2:
			System.out.println("sorted by name");
			break;

		case 3:
			System.out.println("sorted by price");
			break;

		default:
			System.out.println("choice is incorrect");
			break;
		}

		char ch = 'y'; // y, Y, n, N
		switch (ch) {
		case 'y':
			break;

		case 'Y':
			break;

		case 'n':
			break;

		case 'N':
			break;

		default:
			break;
		}

		String calcType = "add"; // add/subtract/multiply/divide
		switch (calcType) {
		case "add":
			break;

		case "multiply":
			break;

		case "subtract":
			break;

		case "divide":
			break;

		default:
			break;
		}
		/*
		 * if (choice == 1) { System.out.println("sorted by id"); } else if (choice ==
		 * 2) { System.out.println("sorted by name"); } else if (choice == 3) {
		 * System.out.println("sorted by price"); } else {
		 * System.out.println("enter correct choice"); }
		 */
	}

	static void loopUsingWhile() {

		int a=5;
		
		//entry-controlled loop
		while(a<0) {
			System.out.println("hello");
			a--;
		}
	}

	static void loopUsingDoWhile() {

		int a=5;
		
		//exit-controlled loop
		do {
			System.out.println("hello");
			a--;
		}while(a<0);
	}
	public static void main(String[] args) {
		//makeDecisionUsingIfElse();
		// makeDecisionUsingSwitch();
		//loopUsingWhile();
		loopUsingDoWhile();
	}

}
