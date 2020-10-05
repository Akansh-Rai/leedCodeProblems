/**
 * 
 */
package com.epam.algo.ds.maths;

/**
 * @author Akansh_Rai
 *
 */
public class AddString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String num1 = "789";
		String num2 = "93242";
		System.out.println(addString(num1, num2));

	}

	private static String addString(String num1, String num2) {
		int len1 = num1.length() - 1;
		int len2 = num2.length() - 1;

		StringBuilder result = new StringBuilder();
		int carry = 0;
		while (len1 >= 0 || len2 >= 0 || carry != 0) {
			int val1 = len1 >= 0 ? num1.charAt(len1--) - '0' : 0;
			int val2 = len2 >= 0 ? num2.charAt(len2--) - '0' : 0;
			int sum = val1 + val2 + carry;
			carry = sum / 10;
			int num = sum % 10;
			result.append("" + sum % 10);

		}

		return result.reverse().toString();

	}

}
