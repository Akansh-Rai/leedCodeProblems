/**
 * 
 */
package com.epam.algo.ds.String;

/**
 * @author Akansh_Rai
 * 
 *         https://leetcode.com/problems/decode-ways
 */
public class DecodeWaysRecussive {

	public static void main(String[] args) {
		System.out.println("Decode 0 in ways : " + numDecodings("0"));
		System.out.println("Decode 0126 in ways : " + numDecodings("0126"));
		System.out.println("Decode 126 in ways : " + numDecodings("126"));
		System.out.println("Decode 1026 in ways : " + numDecodings("1026"));
	}

	public static int numDecodings(String input) {
		return numDecodings(input, input.length());
	}

	public static int numDecodings(String input, int len) {
		if (input.charAt(0) == '0')
			return 0;

		if (len == 0 || len == 1)
			return 1;

		int leftCount = 0;

		// If the last digit is not 0, then
		// last digit must add to the number of words
		if (input.charAt(len - 1) > '0')
			leftCount = numDecodings(input, len - 1);

		// If the last two digits form a number smaller than or equal to 26,
		// then consider last two digits and recur
		int rightCount = 0;
		if (input.charAt(len - 2) == '1' || (input.charAt(len - 2) == '2' && input.charAt(len - 1) < '7'))
			rightCount = numDecodings(input, len - 2);

		return rightCount + leftCount;
	}
}
