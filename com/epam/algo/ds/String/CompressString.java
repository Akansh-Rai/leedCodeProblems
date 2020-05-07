/**
 * 
 */
package com.epam.algo.ds.String;

/**
 * @author Akansh_Rai
 * 
 *         Write a function that transforms string into a new string. New string
 *         does not contain repeating letters but contains a number after every
 *         letter that means how many times the letter was repeated in the
 *         original string. a. “” -> “” b. “a” -> “a1” c. “aaa” -> “a3” d.
 *         “aaabbc” -> “a3b2c1”
 *
 */
public class CompressString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "";
		String input1 = "a";
		String input2 = "aab";
		String input3 = "aaabbc";
		System.out.println("\"" + input + "\" compressed as \"" + compressString(input) + "\"");
		System.out.println("\"" + input1 + "\" compressed as \"" + compressString(input1) + "\"");
		System.out.println("\"" + input2 + "\" compressed as \"" + compressString(input2) + "\"");
		System.out.println("\"" + input3 + "\" compressed as \"" + compressString(input3) + "\"");
	}

	private static String compressString(String input) {
		if (input.length() < 1)
			return input;

		StringBuilder result = new StringBuilder();
		int count = 1;
		int i = 1;
		while (i < input.length()) {
			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				result.append(input.charAt(i - 1)).append(count);
				count = 1;
			}
			i++;
		}

		return result.append(input.charAt(i - 1)).append(count).toString();
	}

}
