/**
 * 
 */
package com.epam.algo.ds.String;

/**
 * @author Akansh_Rai Facebook question
 * 
 *         Given a string, check if it is a palindrome by ignoring spaces. (E.g.
 *         race car would be a palindrome) Ex "race car" - as an palendrom
 */
public class PalindromeIgnoreSpace {

	public static void main(String[] args) {
		String input = "a race car   a";
		System.out.println(input + " is a palindrome " + checkPalindrom(input));
	}

	private static boolean checkPalindrom(String input) {
		if (input == null)
			return false;
		if (input.length() == 1)
			return true;
		int left = 0;
		int right = input.length() - 1;
		while (left <= right) {
			char lChar = input.charAt(left);
			char rChar = input.charAt(right);
			int lval = lChar - 'a';
			int rval = rChar - 'a';
			if (lval < 0 || lval > 26) {
				left++;
				continue;
			} else if (rval < 0 || rval > 26) {
				right--;
				continue;
			} else if (lChar != rChar) {
				return false;
			} else {
				left++;
				right--;
			}
		}

		return true;
	}

}
