/*
 * contains business logic of calculation
 * 
 */
public class Calculation {
	public int addNumbers(int first, int second) {
		int result = first + second;
		return result;
	}

	public int subtractNumbers(int first, int second) {
		int result = first - second;
		return result;
	}

	public int multiplyNumbers(int first, int second) {
		int result = first * second;
		return result;
	}

	public int divideNumbers(int first, int second) {

		// 1. if...else
		/*
		 * int result = 0; if (first > second) { result = first / second; } else {
		 * result = second / first; }
		 */

		int result = first > second ? first / second : second / first;
		return result;
	}
}
