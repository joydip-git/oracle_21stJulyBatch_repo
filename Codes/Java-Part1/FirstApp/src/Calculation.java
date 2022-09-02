/**
 * <h2>Calculation class containing methods for adding, subtracting, multiplying and dividing numbers</h2>
 * @author satarupa
 * @version 1.0.0
 * @since 2022-07-26
 */
public class Calculation {
	
	/**
	 * The method is used to add two numbers
	 * @param first This is the first number
	 * @param second This is the second number
	 * @return returns the summation of two numbers
	 */
	public int addNumbers(int first, int second) {
		int result = first + second;
		return result;
	}

	/**
	 * The method is used to subtract a number from another
	 * @param first This is the first number
	 * @param second This is the second number
	 * @return returns the subtraction of two numbers
	 */
	public int subtractNumbers(int first, int second) {
		int result = first - second;
		return result;
	}

	/**
	 * The method is used to multiply a number by another
	 * @param first This is the first number
	 * @param second This is the second number
	 * @return returns the multiplication of two numbers
	 */
	public int multiplyNumbers(int first, int second) {
		int result = first * second;
		return result;
	}

	/**
	 * The method is used to divide a number by another
	 * <b>Note: always higher value will be divided by lower one</b>
	 * @param first This is the first number
	 * @param second This is the second number
	 * @return returns the division of two numbers
	 */
	public int divideNumbers(int first, int second) {

		// 1. if...else
		
		/*
		 int result = 0; if (first > second) { result = first / second; } else {
		 result = second / first; }
		 */

		int result = first > second ? first / second : second / first;
		return result;
	}
}
