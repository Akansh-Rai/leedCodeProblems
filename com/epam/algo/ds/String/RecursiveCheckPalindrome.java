/**
 * 
 */
package com.epam.algo.ds.String;

/**
 * @author Akansh_Rai
 *
 */
public class RecursiveCheckPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "ababa";
		System.out.println(checkPalindrom(str, 0, str.length() - 1));
	}

	public static boolean checkPalindrom(String input, int left, int right) {
		if (left == right)
			return true;
		if (input.charAt(left) != input.charAt(right))
			return false;

		if (right > left + 1)
			return checkPalindrom(input, left + 1, right - 1);
		return true;
	}
}
