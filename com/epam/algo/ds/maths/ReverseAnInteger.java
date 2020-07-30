/**
 * 
 */
package com.epam.algo.ds.maths;

/**
 * @author Akansh_Rai
 *
 */
public class ReverseAnInteger {

	public static void main(String[] args) {
		int input = 123;
		System.out.println(input + " Reversed value : " + reverseInt(input));
	}

	private static int reverseInt(int input) {
		if (input > 0 && input < 10)
			return input;
		int result = 0;
		while (input > 0) {
			result = result * 10;
			result += (input % 10);
			input /= 10;
		}
		return result;
	}
}
