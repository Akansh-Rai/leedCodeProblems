/**
 * 
 */
package com.epam.algo.ds.String;

/**
 * @author Akansh_Rai
 *
 */
public class ConverInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "42";
		System.out.println(input + " : " + myAtoi(input));
		input = "4193 with words";
		System.out.println(input + " : " + myAtoi(input));
		input = "   -42";
		System.out.println(input + " : " + myAtoi(input));
		input = "words and 987";
		System.out.println(input + " : " + myAtoi(input));
		input = "-91283472332";
		System.out.println(input + " : " + myAtoi(input));
	}

	public static int myAtoi(String input) {
		if (input == null || input.isEmpty() || input.trim().length() == 0) {
			return 0;
		}
		input = input.trim();
		int sign = 1;
		int i = 0;
		char firstChar = input.charAt(0);

		if (firstChar == '-') {
			sign = -1;
			i = 1;
		} else if (firstChar == '+') {
			i = 1;
		}

		int result = 0;
		while (i < input.length() && Character.isDigit(input.charAt(i))) {
			int intValue = Character.getNumericValue(input.charAt(i));
			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && intValue > 7))
				return Integer.MAX_VALUE;
			if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && intValue > 8))
				return Integer.MIN_VALUE;
			result = result * 10 + intValue * sign ;
			i++;
		}
		return result ;
	}

}
